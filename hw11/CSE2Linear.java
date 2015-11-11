/////////////////////
//Oleh Makukh
//11/10/2015
//CSE2
//HW 11 - Fun With Searching
//The program  that prompts the user to enter 15 ints for students’ final grades in CSE2.
//Check that the user only enters ints, and print an error message if the user enters
//anything other than an int. 
//

import java.util.Scanner;     //import class to accept user input

//
// Main program Check begins here
//

public class CSE2Linear{
 //main method required for every Java program
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        int[] grades = new int[15];
//        int gradeEntered = 0;                                   //initialize variable to store entered length
        for(int i=0; i<15;i++){
           System.out.print("Enter the desired final grades:  ");  //message prompt
           while(true){                                        //loop that always runs to check if nputs is correct
            if(myScanner.hasNextInt()){                     //check if input is of int form
                grades[i] = myScanner.nextInt();             //store entered input
                if(grades[i]>0 && grades[i]<101){              //check if entered input is within acceptable range
                if(i>0){
                    if(grades[i] >= grades[i-1] ){
                        break;
                    }
                    else{
                        System.out.print("Please enter a grade that is higher than the last grade entered. Try again: ");   //print prompt
                        i--;
                    }
                  }
                else{
                    break;
                }  
                }
                else{                                       //runs if input was not within acceptable range of 0 to 80
                    System.out.print("Please only enter positive integer and integer that is less than 100. Try again: ");   //print prompt
                }
            }
            else{                                           //runs if input wasn't of an int form
                    System.out.print("Sorry, you did not enter an integer. Try again: ");    //print prompt to try again
                    myScanner.next();                       //take next input
            }
          }              
        }
        
        System.out.print("15 entered ints for final grades in CSE2: ");    //print prompt to try again
        printArray(grades);
        scrambled(grades);
        System.out.print("Scrambled array: ");    //print prompt to try again
        printArray(grades);
        System.out.print("Enter a grade to search for: ");
        int value=myScanner.nextInt();              //input value
        linearSearch(grades,1 );
    }
    public static void printArray(int[] grades){
        for(int i = 0; i<15; i++){
        System.out.print(grades[i]+" ");
        }
        System.out.println();
    }
    
    public static void searchFor(int[] grades, int value){
        
    }
    
    public static void scrambled(int[] grades){  //method that gives outs a hand of 5 random cards
      int rand = 0;                              //initialize an int variable to generate a random number
      int placeHolder = 0;                 //initialize random string variable to hold the value of card in
      int[] temp = new int[15];             //initialize string of 5 elements to store cards in
      for(int i=0; i<15; i++){                    //for loop used to generate 5 cards
       rand = (int) (Math.random()*15);        //generate a random number from 1 to 52
       placeHolder = temp[rand];                //put a card at array rand into a string placeHolder
       temp[i] =  grades[rand];                   //saves random string into hand array
       }                          
    }
    
    public static void linearSearch(int [] grades, int value) {
        int iteration = 1; // delcaring and assigning 1 to iteration
        int i;
        for (i = 0; i < 15; i++) { // while i is less than 15 this loop will run
            if (grades[i] == value) { // if val is equal to array sub i this code will run
                System.out.println(value + " was found in the list with "+iteration+" iterations"); // prints to user
                break; // exits loop
            }
              iteration++; // increments iteration by 1
        }
        if (grades[i] != value) { // if array sub i never equals val this code will run
            System.out.println(value + " was not found in the list with " + iteration + " iterations"); // prints to user
        }
    }    
    
}
        