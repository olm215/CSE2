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

public class lab11Search{
    //main method required for every Java program
    public static void main(String[] args) {
        int[] array1 = new int[5000];        
        int[] array2 = new int[5000];
        Scanner myScanner = new Scanner(System.in);   //allows to prompt user for input
        for(int i = 0; i < 5000; i++){
            array1[i] = (int)(Math.random()*100001);
        }
        
        int min1 = 0;
        int max1 = 0;
        for(int i=0; i<5000; i++){
            if(array1[i]>array1[max1]){
                max1 = i;
            }
            if(array1[i]<array1[min1]){
                min1 = i;
            }
        }
        
        for(int i=0; i<5000; i++){
            array2[i] = (int)(Math.random()*100001);
            if(i>0) {
                while(array2[i-2]>=array2[i]){
                    array2[i] = (int)(Math.random()*100001);
                }
            }
            
            
        }
        
        int min2 = 0;
        int max2 = 0;
        for(int i=0; i<5000; i++){
            if(array2[i]>array2[max2]){
                max2 = i;
            }
            if(array2[i]<array2[min2]){
                min2 = i;
            }
        }        
        
        System.out.println("The maximum of array1 is: " + max1);
        System.out.println("The minimum of array1 is: " + min1);
        System.out.println("The maximum of array2 is: " + max2);
        System.out.println("The minimum of array2 is: " + min2);        
        
        
        
        
    }
}
    
    
    