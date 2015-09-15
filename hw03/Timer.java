/////////////////////
//Oleh Makukh
//09/15/2015
//CSE2
//HW 3 - Timer
//The program that prompts the user for the current time and dinner time
//and calculates the amount of time remaining until they eat dinner.
//

import java.util.Scanner;

//
// Main program Check begins here
//

public class Timer {
    //main method required for every Java program
    public static void main(String[] args) {
        Scanner myTimer = new Scanner(System.in);   //allows to prompt user for input
        System.out.print("Enter the current time: ");  //message prompt
        //using method within Scanner class        
        int currentTime = myTimer.nextInt();  //promt user to enter current time
        System.out.print("Enter the time that you will be eating dinner: "); //message prompt
        int dinnerTime = myTimer.nextInt();   //promt user to enter dinner time
        int deltaTime;   // calculate the time left until dinner time
        deltaTime = dinnerTime - currentTime; //find the absolute difference between times entered
        int hours,   //variable to store hours
              minutes; //variable to store minutes
        hours = (int)(deltaTime/100); //get the two digit hours value
        minutes = (int)(deltaTime%100);  //get the two digit minutes value
        
        //While testing the program I encountered the issue when current time entered is not
        //00 minutes, and the dinner time is 00 minutes(e.g. Current time = 1055, Dinner Time = 1800).
        //The subtraction of these, wil lead to an incorrect value of 0745, whereas correct value should be
        //0705. Hence these if,else statements are written to create a check for possible issues as above.
        //Not sure  if this is necessary for this assignment, but might as well do it right.
        
        int checkCurrentMin;     //variable to store current time minutes
        int checkDinnerMin;      //variable to store dinner time minutes
        checkDinnerMin =  (int)(dinnerTime%100);   //get the two digit minutes value
        checkCurrentMin = (int)(currentTime%100);  //get the two digit hours value

        if(checkDinnerMin == 0) {         //first check if dinner time minutes entered is 0
            if(checkCurrentMin == 0){     //if so, check if current time minutes is 0
                minutes =0;               //if both of the above true, set minutes to 0 and print final statement
                System.out.println("You have " + hours + " hours and " + minutes + " minutes until dinner.");
            }
            else                         //if current time minutes entered is not 0
            {
            minutes = 60 - checkCurrentMin; //set dinner time minutes to 60 instead of 00, to better find difference
            System.out.println("You have " + hours + " hours and " + minutes + " minutes until dinner."); // and print final statement
            }
        }
        else if(checkDinnerMin<checkCurrentMin){  //check if current minutes greater than dinner minutes
            minutes = 60 - checkCurrentMin + checkDinnerMin; //if so, subtract current minutes from 60 and add dinner minutes
            System.out.println("You have " + hours + " hours and " + minutes + " minutes until dinner."); //print fina lstatement
        }
        
        else    //if other conditions not satisfied, just print final statement, no need to adjust minutes
        {
           System.out.println("You have " + hours + " hours and " + minutes + " minutes until dinner."); 
        }
        

    } // end of main method
} //end of class        
        
 