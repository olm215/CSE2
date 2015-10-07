/////////////////////
//Oleh Makukh
//10/02/2015
//CSE2
//Lab 6 - Getting Loopy
//The purpose of this lab is to get familiar with loops, a critical
//piece of syntax that is essential for many programming languages.

//
// Main program Check begins here
//

public class GettingLoopy{
 //main method required for every Java program
    public static void main(String[] args){
        int number=1;
        while(number<=7){
            System.out.print(number);
            number++;
        }

        int count = 1;
        while(count<=7){
            System.out.print(7);
            count++;
        }
     System.out.print("\n");
     System.out.print("WHILE LOOP:");
    
     int prime = 10;
     while(prime<=100){
         if(prime%2!=0 && prime%3!=0 && prime%5!=0 && prime%7!=0){
           //  if(prime%3!=0){
             //    if(prime%5!=0){
                   //  if(prime%7!=0){
                         System.out.print(" "+prime);
                    // }
                // }
           //  }
         }
         prime++;
     }
     System.out.print("\n");
     System.out.print("FOR LOOP:");
     
     for(prime=10;prime<=100;prime++){
         if(prime%2!=0){
             if(prime%3!=0){
                 if(prime%5!=0){
                     if(prime%7!=0){
                         System.out.print(" "+prime);
                     }
                 }
             }
         }         
     }
     System.out.print("\n");
     System.out.print("DO WHILE LOOP:");        
     prime = 10;
     do{
        if(prime%2!=0){
             if(prime%3!=0){
                 if(prime%5!=0){
                     if(prime%7!=0){
                         System.out.print(" "+prime);
                     }
                 }
             }
         } 
         prime++;
     }while(prime>=10 && prime<=100);

     System.out.print("\n");
     int rand =(int)(Math.random()*(195+1)) + 5;
     int i = 1;
     while(i<=rand){
         if(i%20!=0)
         {
         System.out.print("ツ");
         }
         else{
        System.out.println("ツ");
         }
         i++;
     }
          System.out.print("\n");

    }
}