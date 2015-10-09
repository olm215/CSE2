/////////////////////
//Oleh Makukh
//10/09/2015
//CSE2
//Lab 7 - Nested Loop - Encrypted X
//The a program to hide the secret message X. Instead of printing out X which
//everyone can see clearly, we will bury the character in a handful of stars. 

import java.util.Scanner;     //import class to accept user input

//
// Main program Check begins here
//

public class encrypted_x{
 //main method required for every Java program
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);   //allows to prompt user for input
        System.out.print("Please enter a size of sqaure:  ");  //message prompt  
        int input = 0;
        while(true){
            if(myScanner.hasNextInt()){
                input = myScanner.nextInt();
                if(input<100 && input>0){
                    break;
                }
                else{
                    System.out.print("Please only enter integer between 0 and 100. Try again: ");   //print prompt
                }
            }
            else{
                    System.out.println("Sorry, you did not enter an integer. Try again: ");    //print prompt to try again
                    myScanner.next();
            }
        }
        
        
        
        
        
        
        
 //       while(myScanner.hasNextInt()){                                          //if number wasn't inputted, run this while loop
  //              System.out.println("Sorry, you did not enter an integer. Try again: ");    //print prompt to try again
    //            myScanner.next();                                                   //next try input
      //      }
//
    //        input = myScanner.nextInt();
  //          while (input>100 || input<0){                                                       //if a number inputted was less than 0, ask to input a postivie number
      //          System.out.print("Please only enter integer between 0 and 100. Try again: ");   //print prompt
        //        myScanner.next();                                                   //accepting next input
    //        }
    //        input = myScanner.nextInt();

        
        for(int i=0; i<input+1; i++){            //loop for printing * and space for x
            for(int j=0;j<input+1;j++){
                if(i==j || j==input-i){
                    System.out.print(" ");
                    }
                    else
                    {
                        System.out.print("*");
                    }
                }
                System.out.println("");
            }
    }
}