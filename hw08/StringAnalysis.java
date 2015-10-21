/////////////////////
//Oleh Makukh
//10/20/2015
//CSE2
//HW 8 - Shapes, Program 2
//The program  that can process a string by examining all the characters, or
//just a specified number of characters in the string, and determining if they are letters.
//

import java.util.Scanner;     //import class to accept user input

//
// Main program Check begins here
//

public class StringAnalysis{
 //main method required for every Java program
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);   //allows to prompt user for input
        System.out.print("Please input your desired string:  ");  //message prompt
        String input = null;                                     //initialize variable to store entered string         
        input = myScanner.nextLine();                            //store entered input
        System.out.print("Do you want to evaluate full string or part of it?(enter full or part):  ");  //message prompt
        String ans = null;                                       //initiliaze variable to store an answer
        while(true){                                             //loop that always runs to check if input is correctly entered
            ans = myScanner.nextLine();                          //store entered input
            if(ans.equals("full") || ans.equals("part")){       //check if input is proper
                break;                                           //if so, get out of loop
            }
            else{                                               //runs if input wasn't of form full or part
                System.out.print("Please only enter full or part. Try again: ");   //print prompt
            }
        }
        
        boolean checkLetters = true;                            //initialize boolean statement to true
        int numb1 = 0;                                          //initilize int variable
        if(ans.equals("full")){                                 //check if answer entered by user was full        
            checkLetters = eval(input);                         //if so, evaluate in method eval and return with boolean assignment to checkLetters varaible
        }
        else{                                                   //otherwise, if answer not full, run this        
            System.out.print("Enter the number of elements you want to evaluate: ");    //message prompt
            while(true){                                        //loop that always runs to check if input is correctly entered as int
                if(myScanner.hasNextInt()){                     //runs if user entered an int
                    numb1 = myScanner.nextInt();                //stores user input i nvariable numb1
                    if(numb1>0){                                //check if int entered is positive  
                        break;                                  //if so, get out of the loop
                    }
                    else{                                       //runs if int entered was negative    
                        System.out.print("Please only enter a positive integer greater than 0. Try again: ");   //print prompt
                    }
                }
                else{
                        System.out.print("Sorry, you did not enter an integer. Try again: ");    //print prompt to try again
                        myScanner.next();               //accept next input
                }
            }
            checkLetters = eval(input,numb1);                   //runs after while loop, calls on method eval to evaluate with input and numb1 variables used
        }

        if(checkLetters){                                       //checks whether statetement is true 
            System.out.println("The string consist of only letters.");  //if true, then string consist of only letters
        }
        else{                                                   //runs when checkLetters is fals            
            System.out.println("The string consist of letters and numbers.");   //string consist of both letters and numbers
        }
        }
    
    public static boolean eval(String input){                   //method to evaluate string for presence of letters and numbers, this evaluates full string
    boolean checkLetters = true;                                 //boolean that used to determine if string of letters only or not
    for(int i = 0; i < input.length(); i++){                //the loop to see if all characters are letters
        char ch = input.charAt(i);                          //store a given character i in varaible ch, so we can evaluate every element in the string
        if (ch >= 'a' && ch <= 'z'){                        //check if an element evaluated is a letter
            continue;                                       //if it is a letter, continue to next character in the string
        }
        else{                                               //otherwise, change the statement of checkLetters
            checkLetters = false;                           //boolean checkLetters is now false, as number was detected
            break;                                          //get out and continue onto next element in the string
        }
    }
    return checkLetters;                                    //after loop is finished return the bollean value of checkLetters to main method
    }
    
    public static boolean eval(String input, int numb1){         //method to evaluate string for presence of letters and numbers, this evaluates for a number of elements specified by user
    boolean checkLetters = true;                                 //boolean that used to determine if string of letters only or not
    if(numb1 > input.length()){                                 //check if user inputted number is greater than length of string being evaluate
        numb1 = input.length();                                 //if so, assign length of string to variable numb1
    }
    for(int i = 0; i < numb1; i++){                              //the loop to see if all characters are letters
        char ch = input.charAt(i);                          //store a given character i in varaible ch, so we can evaluate every element in the string
        if (ch >= 'a' && ch <= 'z'){                        //check if an element evaluated is a letter
            continue;                                       //if it is a letter, continue to next element in the string
        }
        else{                                               //otherwise, change the statement of checkLetters
            checkLetters = false;                           //boolean checkLetters is now false, as number was detected
            break;                                          //get out and continue onto next element in the string
        }
    }
    return checkLetters;                                    //after loop is finished return the bollean value of checkLetters to main method
    }
}