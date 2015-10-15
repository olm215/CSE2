/////////////////////
//Oleh Makukh
//10/14/2015
//CSE2
//HW 7 - Twisty!
//The program that asks the user for two integers: Length and Width. 
//Length is to specify how many characters the following pattern should spread,
//horizontally, across the screen.  Width should specify how many characters
//the following pattern should spread, vertically, across the screen.

import java.util.Scanner;     //import class to accept user input

//
// Main program Check begins here
//

public class Twisty{
 //main method required for every Java program
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);   //allows to prompt user for input
        System.out.print("Input your desired length:  ");  //message prompt
        int inLength = 0;                                   //initialize variable to store entered length
        while(true){                                        //loop that always runs to check if nputs is correct
            if(myScanner.hasNextInt()){                     //check if input is of int form
                inLength = myScanner.nextInt();             //store entered input
                if(inLength>0 && inLength<80){              //check if entered input is within acceptable range
                    break;                                  //if so, get out of loop
                }
                else{                                       //runs if input was not within acceptable range of 0 to 80
                    System.out.print("Please only enter positive integer and integer that is less than 80. Try again: ");   //print prompt
                }
            }
            else{                                           //runs if input wasn't of an int form
                    System.out.print("Sorry, you did not enter an integer. Try again: ");    //print prompt to try again
                    myScanner.next();                       //take next input
            }
        }
        
        System.out.print("Input your desired width:  ");     //message prompt
        int inWidth = 0;                                    //initialize variable to store entered width
        while(true){                                        //loop that always runs to check if nputs is correct
            if(myScanner.hasNextInt()){                     //check if input is of int form
                inWidth = myScanner.nextInt();             //store entered input
                if(inWidth<inLength && inWidth>0){         //check if entered input width is less than length previously entered
                    break;                                  //if so, get out of loop
                }
                else{                                       //runs if input width was greater than length previously entered
                    System.out.print("Error: Please input an integer smaller than the length. Try again: ");   //print prompt
                }
            }
            else{
                    System.out.print("Sorry, you did not enter an integer. Try again: ");    //print prompt to try again
                    myScanner.next();                       //take next input
            }
        }
        
        for(int i=0; i<inWidth; i++){              //loop for printing lines
            for(int j=0; j<inLength; j++){         //loop for printing horizontally for given length
            if (i == j%inWidth){                   //print first part of x with # and \  
                if((j/inWidth)%2 != 0){            //check if condition is matched          
                    System.out.print("\\");        //if remainder is not 0, print \
                }
                else{
                    System.out.print("#");         //else if remainder is 0, print #
                }
            }
            else if (j%inWidth == inWidth - (i+1)){     //print second part of x with # and /
                if(j/inWidth %2 != 0){                  //check if condition is matched 
                    System.out.print("#");              //if remainder is not 0, print #              
                }
                else{
                    System.out.print("/");            //else if remainder is 0, print /
                }
            }
            else{
                System.out.print(" ");          //print space, if no other condition is matched    
            }
            }
            System.out.print("\n");             //print new line
        }
    }
}