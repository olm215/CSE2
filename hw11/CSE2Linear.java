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
                if(i>0){                                    //if so, proceed
                    if(grades[i] >= grades[i-1] ){          //check if the input entered greater than last accepted input
                        break;                              
                    }
                    else{
                        System.out.print("Please enter a grade that is higher than the last grade entered. Try again: ");   //print prompt
                        i--;
                    }
                  }
                else{
                    break;              //if first entered grade, do not need to check if its greater than previous one
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
        
        System.out.print("15 entered ints for final grades in CSE2: ");    //print prompt
        printArray(grades);                                                //call method to print out an array with grades listed                                    
        System.out.print("Enter a grade to binary search for: ");          //print prompt
        int binsearch = myScanner.nextInt();                               //accept the term to be binary searched for
        binarySearch(grades, binsearch);                                   //call a method binary search            
        
        scrambled(grades);                          //call method to scramble the array of grades
        System.out.print("Scrambled array: ");      //print prompt
        printArray(grades);                         //print the scramble array
        
        System.out.print("Enter a grade to linear search for: ");   //print prompt
        int linsearch = myScanner.nextInt();                        //accept the term to be linearly searched for
        linearSearch(grades, linsearch);                            //call a method linear search

    }
    public static void printArray(int[] grades){            //method that prints an array of grades
        for(int i = 0; i<15; i++){                          //loop to go through all the grades
        System.out.print(grades[i]+" ");                    //print grade
        }
        System.out.println();                               //print line
    }
    
    public static void scrambled(int[] grades){  //method that randomizes the grades within an array
      int rand = 0;                              //initialize an int variable to generate a random number
      int placeHolder = 0;                      //initialize random string variable to hold the value of grade in
      for(int i=0; i<15; i++){                  //for loop used to generate randomization process
       rand = (int) (Math.random()*15);        //generate a random number from 0 to 14
       placeHolder = grades[i];                //put a grade at array grades into a string placeHolder
       grades[i] =  grades[rand];              //saves random string into grade array
       grades[rand] = placeHolder;             //places the previous number at location i back into array at position of other grade pulled out
       }                          
    }
    
    public static void binarySearch(int [] grades, int binsearch) {         //method for binary search
        int comparisons = 0;                //initialize a variable to count number of comparisons 
        int min = 0;                        //initialize variable to keep count of min value
        int max = 14;                       //initialize variable to keep count of max vlaue
        int mid = (min+max)/2;              //calculate mid value
        for(int i = 0; i<15; i++){          //loop that helps with tracking number of comparisons made
            comparisons = i + 1;            //define comparisons
            if(max >= min){                 //run when max value larger than min
                mid = (min+max)/2;          //recalculate mid vlaue
                if(grades[mid]>binsearch){  //determine whether the array grades at location mid is larger than the searched term
                    max = mid - 1;          //if so, decrease max value by 1
                }
                else if(grades[mid]==binsearch){    //determine whether the array grades at location mid is matched with the searched term    
                    System.out.println("" + binsearch + " was found in the list with " + comparisons + " comparisons"); //if so, print this message out
                    break;                              //get out of loop
                }   
                else{                           //runs when the searched term is greater than the value at an array mid location
                    min = mid + 1;              //if so, increase min value by 1
                }
            }
            else{                               //if min value is greater than max, this means the term searched is not in the array
                System.out.println("" + binsearch + " was not found in the list with " + comparisons + " comparisons");  //print prompt
                break;                          //get out of the loop
            }
        }
    }
    
    public static void linearSearch(int[] grades, int linsearch){  //method for linear search
        int comparisons = 0;                //initialize a variable to count number of comparisons 
        int notFound = 0;                   //initialize a variable to count number of comparisons not found
        for (int i = 0; i<15; i++) {            //loop to go through all grades in an array
            comparisons = comparisons + 1;
            if (grades[i] == linsearch) {       //compare i location with user entered search parameter
               // comparisons = i;                //keeps track of number of comparisons performed
                System.out.println("" + linsearch + " was found in the list with " + comparisons + " comparisons");      //print prompt
            }
            else {
                notFound++;             //keeps track of not founded comparisons
            }
        }
        if (notFound == 15) {                       //runs when no comparisons were found
            System.out.println("" + linsearch + " was not found in the list with " + notFound + " comparisons");        //print prompt
        }
    }    
    
}
        