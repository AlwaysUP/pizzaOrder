import java.io.*;
import java.util.*;
public class PizzaDriver{

   private static PrintWriter fprint;

   public static void main(String[] args) throws IOException {
        
      //int x = 50;
      /*String xy = "";
      String y = "";
      String yz = "";*/
        //FIle file = File("OrderMenu.txt");
        //Scanner input1 = new Scanner(file);
      System.out.println("Hello Sir/Madam, We have world known pizzas to offer.");
      System.out.println("Please keep reading to choose what you would like to get");
      Scanner input = new Scanner(System.in);
      File readd = new File("Read.txt");
      Scanner reader = new Scanner(readd);
      int choice;
      Soda mysoda = new Soda();
      Pizza mypizza = new Pizza();
      String complaint = "";
      String name = "";
      int food = 0;
      int service = 0;
      int budget = 0;
      String pause = "";
      int ave = 0;
      int add = 0;
      int price = 0;
      //int data = 0;
      
      do{
         System.out.println("[0]Read from file"+"\n"+"[1]Select Pizza"+"\n"+"[2]Select Drink"+"\n"+"[3]Save order"+"\n"+"[4]View Order"+"\n"+"[5]View Price"
                 +"\n"+"[6]Place Order"+"\n"+"[7]Take a survey"+"\n"+"[8]Complain to the manager"+"\n"+"[9]Search for food based on price"+"\n"+"[10]Check how much past customers spent on average"
                 +"\n"+"[11]Quit Menu"+"\n");
         choice = input.nextInt();
         
         if (choice == 0)
         {
            System.out.println("please visit the text documet and type in the values for the pizza in this order: "+"\n"+
                    "size"+"\n"+"topping"+"\n"+"crust"+"\n"+"sauce"+"\n");
            String a = reader.nextLine();
            String[] i = (a.split(","));
            mypizza.setsize(Integer.parseInt(i[0]));
            mypizza.setcrust(i[1]);
            mypizza.setsauce(i[2]);
            mypizza.settopping(i[3]);
            System.out.println("Your ordered pizza is:"+mypizza.getsize()+" inches in size"+"\n"+"the crust is: "+mypizza.getcrust()
               +"\n"+"the selected sauce: "+mypizza.getsauce()+"\n"+"the selected topping is: "+mypizza.gettopping()+"\n");
         }
         else if (choice == 1)
         {
            {
                    
               {     
                    
                  System.out.println("Please select the size of your pizza");
                  mypizza.setsize(input.nextInt());
                  System.out.println("Please choose the sauce"+"\n"+"[1]Tomato sauce"+"\n"+"[2]Garlic Parmesan sauce");
                  int choice1 = input.nextInt();
                  if (choice1 == 1)
                  {
                     mypizza.setsauce("Tomato sauce");
                  }
                  if (choice1 == 2)
                  {
                     mypizza.setsauce("Garlic Parmesan sauce");
                  }
                  System.out.println("Please select the type of pizza"+"\n"+"[1]Cheese"+"\n"+"[2]Meat Lovers"+"\n"+"[3]Veggie Lovers"+"\n"+
                     "[4]Supreme"+"\n"+"[5]Hawaiian");
                  int choice2 = input.nextInt();
                  if (choice2 == 1)
                  {
                     mypizza.settopping("Cheese");
                  }
                  else if (choice2 == 2)
                  {
                     mypizza.settopping("Meat Lovers");
                  }
                  else if (choice2 == 3)
                  {
                     mypizza.settopping("Veggie Lovers");
                  }
                  else if (choice2 == 4)
                  {
                     mypizza.settopping("Supreme");
                  }
                  else
                  {
                     mypizza.settopping("Hawaiian");
                  }
                  System.out.println("Please choose your Crust"+"\n"+"[1]Garlic Bread"+"\n"+"[2]Pan"+"\n"+"[3]Thin Crust");
                  int choice3 = input.nextInt();
                  if(choice3 == 1)
                  {
                     mypizza.setcrust("Garlic Bread");
                  }
                  else if(choice3 == 2)
                  {
                     mypizza.setcrust("Pan");
                  }
                  else
                  {
                     mypizza.setcrust("Thin Crust");
                  }
                  System.out.println("Please wait...");
                   
                  System.out.println("Your ordered pizza is:"+mypizza.getsize()+" inches in size"+"\n"+"the crust is: "+mypizza.getcrust()
                     +"\n"+"the selected sauce: "+mypizza.getsauce()+"\n"+"the selected topping is: "+mypizza.gettopping()+"\n");
               }
            }
            

         }
         else if (choice == 2)
         {
            	
            {System.out.println("What kind of drink would you like?"+"\n"+"(1)Pepsi"+"\n"+"(2)Mtn Dew"+"\n"+"(3)Siera Mist"+"\n"+"(4)Lemonade");
               int choice4 = input.nextInt();
               System.out.println("What size would you like?"+"\n"+ "please type 20 for a 20 ounce bottle and"
                  +" type 2 for a 2 liter bottle");
               mysoda.setsdasize(input.nextInt());
               if (choice4 == 1)
               {
                  mysoda.setsoda("Pepsi");
               }
               else if (choice4 == 2)
               {
                  mysoda.setsoda("Mtn Dew");
               }
               else if (choice4 == 3)
               {
                  mysoda.setsoda("Siera Mist");
               }
               else
               {
                  mysoda.setsoda("Lemonade");
               }
               System.out.println("Your choice of Soda is: "+mysoda.getsoda()+"\n"); 
            }
         }
         else if (choice == 3)
         {
            FileWriter writer = new FileWriter("RecentOrder.txt",true);                    
            PrintWriter fprint = new PrintWriter(writer);
            fprint.append("*****************************************************************************************");
            fprint.append("Your ordered pizza is:");
            fprint.append("\r\n");
            fprint.append(mypizza.getsize()+" inches in size");
            fprint.append("\r\n");
            fprint.append("the crust is: "+mypizza.getcrust());
            fprint.append("\r\n");
            fprint.append("the selected sauce: "+mypizza.getsauce());
            fprint.append("\r\n");
            fprint.append("the selected topping is: "+mypizza.gettopping());
            fprint.append("\r\n");
            fprint.append("Your selected Drink is: "+ mysoda.getsoda());
            fprint.append("\r\n");
            fprint.append("and the size is: "+mysoda.getsdasize());
            fprint.append("\r\n");
            fprint.append("Your complaint was: "+complaint);
            fprint.append("*****************************************************************************************");
            fprint.append("\r\n");
                  //fprint.println("test");
            fprint.close();
            System.out.println("Please check the text file to view saved order"+"\n");
                
         }
         else if (choice == 4)
         {
            System.out.println("Processing recent changes....");
            System.out.println("");
            System.out.println("You ordered:");
            System.out.println("Your ordered pizza is:"+"\n"+mypizza.getsize()+" inches in size"+"\n"+"the crust is: "+mypizza.getcrust()
                  +"\n"+"the selected sauce: "+mypizza.getsauce()+"\n"+"the selected topping is: "+mypizza.gettopping()+"\n"
                  +"Your selected Drink is: "+mysoda.getsoda()+" ....."+"and the size is: "+mysoda.getsdasize()+"\n"+"Your complaint was: "+
                  complaint+"\n");
         
         }
         else if (choice == 5)
         {     System.out.println("You have requested to see your order's price");
               if ( mypizza.topping.equals("Cheese"))
               {
                  price = 0;
               }
               else if (mypizza.topping.equals("Supreme"))
               {
                  price = 3;
               }
               else if (mypizza.topping.equals("Meat Lovers"))
               {
                  price = 3;
               }
               else if (mypizza.topping.equals("Veggie Lovers"))
               {
                  price = 2;
               }
               else if (mypizza.topping.equals("Hawaiian"))
               {
                  price = 2;
               }
               else 
               {
                  price = 0;
               }
               if (mypizza.size >= 12)
               {
                  price = price +11;
               }
               else if (mypizza.size > 4 && mypizza.size < 12)
               {
                  price = price +8;
               }
               else if (mypizza.size > 0 && mypizza.size <= 4)
               {
                  price = price + 4;
               }
               else
               {
                  price = 0;
               }
               if (mysoda.soda.equals("Pepsi"))
               {
                  price = price + 2;
               }
               else if (mysoda.soda.equals("Mtn Dew"))
               {
                  price = price + 2;
               } 
               else if (mysoda.soda.equals("Siera Mist"))
               {
                  price = price + 2;
               } 
               else if (mysoda.soda.equals("Lemonade"))
               {
                  price = price + 1;
               }
                
               if (mysoda.sdasize==2)
               {
                  price = price + 2;
               }
               else if (mysoda.sdasize==20)
               {
                  price = price + 1;
               }
               System.out.println(input.nextLine());
               System.out.println("Your Price is: $"+ price+"\n");
               
                FileWriter riter = new FileWriter("price.txt",true);                    
                PrintWriter up = new PrintWriter(riter);
                   up.append("\r\n"); 
                   up.append(Integer.toString(price)); 
                   up.close();
         }
         else if (choice == 6)
         {
            System.out.println("Your order is being processed...");
            System.out.println("Please wait");
            System.out.println();
            System.out.println("Your order has successfully been sent to the cook..."+"\n"+"please wait 15 mintues for your order,"
                 +"\n"+"Thank you for choosing our restaurant");
         
         }
         else if (choice == 7)
         {
            System.out.println("Hope you ejoyed your meal"+"\n"+"Please tell us about your experience"+"\n"+"What is your name?");
            System.out.println(input.nextLine());
            name = input.nextLine();       
            System.out.println("on a scale of 1-10 what would you rate the food?");
            food = input.nextInt();
            System.out.println("What would you rate the service?");
            service = input.nextInt();
            FileWriter writer1 = new FileWriter("Survey.txt",true);                    
            PrintWriter fwrite = new PrintWriter(writer1);
            fwrite.write("\r\n");
            fwrite.write("*****************************************************************************************");
            fwrite.write("\r\n");
            fwrite.write(name+" has rated the food as: "+food);
            fwrite.write("\r\n");
            fwrite.write("Has rated the service as: "+service);
            fwrite.write("\r\n");
            fwrite.write("*****************************************************************************************");
            fwrite.write("\r\n");
            fwrite.close();
            System.out.println("Thank you for your time");
         }
         else if (choice == 8)
         {
            System.out.println("We apologize for the inconvenience"+"\n"+"Please tell us more about it..."+"\n"+"What is your name?");
            System.out.println(input.nextLine());
            name = input.nextLine();             
            System.out.println("Please type in your complaint");               
            complaint = input.nextLine();
            FileWriter writer2 = new FileWriter("Complaint.txt",true);                    
            PrintWriter gwrite = new PrintWriter(writer2);
            gwrite.write("\r\n");
            gwrite.write("*****************************************************************************************");
            gwrite.write(name+" has made this complaint: "+complaint);
            gwrite.write("*****************************************************************************************");
            gwrite.write("\r\n");
            gwrite.close();
            System.out.println("Thank you!");
         }
         else if (choice == 9)
         {
            input.nextLine();
            System.out.println("How much do you plan on spending?"+"\n");
            budget = input.nextInt();
            if (budget >= 11)
            {
            System.out.println("You could get a large pizza"+"\n"+"or you could try a medium or small pizza and best part is...."+"\n"+
            "                      You get to choose the exact size in inches(whole numbers only)"+"\n"+"You could also get a soda with that"+"\n"+"Sorry if you were expecting wings we do not have them"
            +"\n"+"Hope you like the pizza"+"\n");
            
            }
            else if (budget >= 8 && budget < 11)
            {
            System.out.println("You could get a medium pizza and or a small drink with that much"+"\n"+"Sorry if you were expecting wings we do not have them"
            +"\n"+"Hope you like the pizza"+"\n");
            }
            else if (budget >= 4 && budget < 8)
            {
            System.out.println("You could get a small pizza and or a drink"+"\n"+"Sorry if you were expecting wings we do not have them"
            +"\n"+"Hope you like the pizza"+"\n");
            }
            else {
            System.out.println("Sorry! \n"+ "Read the directions carefully and try again"+"\n");
            }
            input.nextLine();
                    pause = input.nextLine();
                    
                    System.out.println(pause);
         }
         else if (choice == 10)
         {  File t = new File("price.txt");
            Scanner b = new Scanner(t);
            String[] v = new String[80];
            int x = 0;
            while ( b.hasNext() )
   	      {
   	         v[x] = b.nextLine();          

   	          x++;                      
          	}
         int[] aa = new int[x];
   	   for (int a = 0; a < x; a++)
            {            
                    aa[a] = Integer.parseInt(v[a]);
              // System.out.println("The amount people spent individually: "+aa[a]);
                    add = add+aa[a];                    
              
         } //for
          ave = add/x;                    
             
               System.out.println("The average of the amount of money people spent: "+ave);

         }
         
         else
         {
            break;
         }
      }while((choice >= 0 ) && (choice <= 10));//do
   }//main
}//class



