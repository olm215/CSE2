/////////////////////
//Oleh Makukh
//10/30/2015
//CSE2
//Lab 10 - Arrays
//The a program which provides grades for the user inputted students.
//

import java.util.Scanner;     //import class to accept user input

//
// Main program Check begins here
//

public class lab10Arrays{
    //main method required for every Java program
    public static void main(String[] args) {
        
        int arraySize = (int)(Math.random()*6)+5; //generate number from 1 to 10
        String[] students = new String[arraySize];
        Scanner myScanner = new Scanner(System.in);   //allows to prompt user for input
       
        for(int i=0; i<arraySize; i++){
           System.out.print("Please input student's name:  ");  //message prompt
           students[i] = myScanner.next();
        }
        
        int[] scores = new int[arraySize];
       
        for(int i=0; i<arraySize; i++){
            scores[i] = (int)(Math.random()*101); //generate number from 0 to 100            
        }
        
        System.out.println("Here are the midterm grades of the 5 students above:");
        for(int i=0; i<arraySize; i++){
            System.out.println(students[i] + " : " + scores[i]);
        }
      
        
        
        
    }
}
    
    
    
    
    
    
    
    
