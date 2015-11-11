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
        int[] array1 = new int[5000];        
        int[] array2 = new int[5000];
        Scanner myScanner = new Scanner(System.in);   //allows to prompt user for input
        for(int = 0; i < 5000; i++){
            array1[i] = (int)(Math.random()*100001);
        }
        
        int min = 0;
        int max = 0;
        for(int i=0; i<5000; i++){
            if(array1[i]>array1[max]){
                max = i;
            }
            if(array1[i]<array1[min]){
                min = i;
            }
        }
        
        for(int i=0; i<5000; i++){
            
        }
        
        
        
        
    }
}
    
    
    