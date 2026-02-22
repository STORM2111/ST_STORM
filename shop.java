import java.util.*;

public class shop{

    public static final String RESET = "\u001B[0m";
 
    public static final String YELLOW = "\u001B[33m";
 
    public static final String LIGHT_BLUE = "\u001B[36m";
 
    public static final String GREEN = "\u001B[32m";

    public static final String RED = "\u001B[31m";

    public static final String INDIGO = "\u001B[38;5;54m";
 
    public static final String BG_NAVY = "\u001B[44m";
    
    public static final String ORANGE = "\u001B[38;5;208m";
    

    //main list
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("\n\n");
        System.out.println(GREEN+"--- welcome to the shop ---");
        System.out.println(" choose what number you want to buy ");

        System.out.println("\n-----\n Bay System \n-----"+RESET);
        System.out.print(ORANGE+"\n 1 -> ipad     = 2399 $ \n 2 -> iphone   = 1500 $ \n 3 -> macbook  = 2600 $ \n 4 -> samsung  = 2210 $ \n 5 -> air buds = 850 $ \n"+RESET);
        System.out.println("\n 9 -> remove item from bag");
        System.out.println(" 0 -> stop");




        double cash = 0;
        
        while (true) {
            
        System.out.print(ORANGE+"\n\n Enter how much money you have : "+RESET);

        if (!input.hasNextDouble()) {
            System.out.println(RED+"\n ❌ Please enter numbers only  ❌ \n"+RESET);
            input.next();
            continue;
        }

        else{
        cash = input.nextDouble();
        break;
        }
    }
    



        ArrayList<Integer> bag = new ArrayList<>();  //  bag
        int salary = 0;

        while(true){     //first
            System.out.print(LIGHT_BLUE+"\n put one number to buy (1-5) \n or 7 to show your cash \n or 8 to show your bag \n or 9 to remove \n or 0 to stop \n\tEnter your choose : "+RESET);

            if (!input.hasNextInt()) {
                System.out.println(RED+"\n ❌ Please enter only the numbers in the list ❌ \n"+RESET);
                input.next();
                continue;
            }

            int num = input.nextInt();

            //  System add
            if (num > 0 && num < 6){

                

                switch(num){
                    case 1:if(cash>=2399){ salary += 2399;cash-=2399;bag.add(num);System.out.println(GREEN+"\n -----\n OK added \n -----"+RESET); break;}else{System.out.println(RED+"\n you don't have enogh mony \n"+RESET);break;}
                    case 2:if(cash>=1500){ salary += 1500;cash-=1500;bag.add(num);System.out.println(GREEN+"\n -----\n OK added \n -----"+RESET); break;}else{System.out.println(RED+"\n you don't have enogh mony \n"+RESET);break;}
                    case 3:if(cash>=2600){ salary += 2600;cash-=2600;bag.add(num);System.out.println(GREEN+"\n -----\n OK added \n -----"+RESET); break;}else{System.out.println(RED+"\n you don't have enogh mony \n"+RESET);break;}
                    case 4:if(cash>=2210){ salary += 2210;cash-=2210;bag.add(num);System.out.println(GREEN+"\n -----\n OK added \n -----"+RESET); break;}else{System.out.println(RED+"\n you don't have enogh mony \n"+RESET);break;}
                    case 5:if(cash>=850){ salary += 850;cash-=850;bag.add(num);System.out.println(GREEN+"\n -----\n OK added \n -----"+RESET);  break;}else{System.out.println(RED+"\n you don't have enogh mony \n"+RESET);break;}
                }
                continue;
            }


            //System to show and add
            else if(num == 7){ 
                System.out.println(GREEN+"\n\n\n-----\n system cash \n-----\n"+RESET);
                System.out.print(ORANGE+" to show you chash press (1) to add press (2) : "+RESET);


            if (!input.hasNextInt()) {
                System.out.println(RED+"\n ❌ Please enter only the numbers in the list ❌ \n"+RESET);
                input.next();
                continue;
            }

            int show = input.nextInt();
            if(show == 1){
                System.out.println(GREEN+"\n your cash is --> " + cash +"$"+RESET);
            }
            else if(show == 2){
                System.out.print(GREEN+"\n Enter how much you need to add : "+RESET);

            if (!input.hasNextInt()) {
                System.out.println(RED+"\n ❌ Please enter only the numbers in the list ❌ \n"+RESET);
                input.next();
                continue;
            }

            int cash_2 = input.nextInt();
            cash+=cash_2;
            System.out.println(GREEN+"\n\n-----\n OK add \n-----\n\n"+RESET);
            }
            }


            else if(num == 8){
                System.out.print("\n your bag --> ");
                for (int item : bag){
                    switch(item){
                        case 1:System.out.print("ipad - "); break;
                        case 2:System.out.print("iphone - "); break;
                        case 3:System.out.print("macbook - "); break;
                        case 4:System.out.print("samsung - "); break;
                        case 5:System.out.print("air buds - "); break;
                    }
                }
                System.out.println("");

            }


            //  حذف
            else if (num == 9){
                while(true){

                if (bag.isEmpty()){
                    System.out.println(RED+"\n Your bag is empty, nothing to remove.\n"+RESET);
                    break;
                    
                }
                System.out.println(GREEN+"\n-----\n Remove System \n-----"+RESET);
                System.out.print(ORANGE+"\n choose from --> " + bag + "\n----\n your bag --> "+RESET);
                for (int item : bag){
                    switch(item){
                        case 1: System.out.print("ipad - "); break;
                        case 2: System.out.print("iphone - "); break;
                        case 3: System.out.print("macbook - "); break;
                        case 4: System.out.print("samsung - "); break;
                        case 5: System.out.print("air buds - "); break;
                    }
                }
                System.out.println("");

                System.out.print(YELLOW+"\n Enter item number to remove (1-5) or ( 0 ) to EXIT : "+RESET);

                if (!input.hasNextInt()) {
                    System.out.println(RED+"\n ❌ Please enter numbers only (1 - 5) ❌ \n"+RESET);
                    input.next();
                    continue;
                }

                int removeNum = input.nextInt();

                if(removeNum == 0){
                    System.out.println(GREEN+"\n-----\n back \n-----"+RESET);
                    break;
                }

                if (removeNum < 1 || removeNum > 5){
                    System.out.println(RED+"\n please Enter 1 - 5 only \n"+RESET);
                    continue;
                }

                // يشيل أول مرة يلاقي فيها الرقم (لو متكرر)
                boolean removed = bag.remove(Integer.valueOf(removeNum));

                if (!removed){
                    System.out.println(RED+"\n\n This item is not in your bag.\n"+RESET);
                    continue;
                }

                // ينقص السعر
                switch(removeNum){
                    case 1: salary -= 2399;cash+=2399; break;
                    case 2: salary -= 1500;cash+=1500; break;
                    case 3: salary -= 2600;cash+=2600; break;
                    case 4: salary -= 2210;cash+=2210; break;
                    case 5: salary -= 850;cash+=850;  break;
                }

                System.out.println(GREEN+"\n -----\n Removed successfully \n -----"+RESET);
                continue;
         
                }}
            
                

            //  إنهاء
            else if(num == 0){

                System.out.println("\n----------\n");
                System.out.print(INDIGO+" you have in your bag --> ");

                // طباعة السلة كأسماء
                for (int item : bag){
                    switch(item){
                        case 1: System.out.print("ipad - "); break;
                        case 2: System.out.print("iphone - "); break;
                        case 3: System.out.print("macbook - "); break;
                        case 4: System.out.print("samsung - "); break;
                        case 5: System.out.print("air buds - "); break;
                    }
                }

                System.out.println("\n----\n this is total salary --> " + salary + "$");

                System.out.println("\n the rest of your money --> "+cash + "$" + RESET);
                break;
            }

            else{
                System.out.println(RED+"\n please Enter 0 - 5 only (or 9 to remove) \n"+RESET);
            }
        }

        System.out.println(GREEN+"\n--------------\n");
        System.out.println(" THX for using my shop have fun");
        System.out.println("\n--------------\n"+RESET);

        input.close();
    }
}    