/////////////////////
//Oleh Makukh
//11/17/2015
//CSE2
//HW 12 - Fun With Searching
//The program  that implement matrix transposition on random matrices.
//

import java.util.Scanner;     //import class to accept user input

//
// Main program Check begins here
//

public class Transpose{
 //main method required for every Java program
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the width of the matrix:  ");  //message prompt
        int inWidth = 0;                                   //initialize variable to store entered width
        while(true){                                        //loop that always runs to check if nputs is correct
        if(myScanner.hasNextInt()){                     //check if input is of int form
            inWidth = myScanner.nextInt();             //store entered input
            if(inWidth>0){                            //check if entered input is within acceptable range
                break;
            }
            else{                                       //runs if input was not within acceptable range
                System.out.print("Please only enter positive integer. Try again: ");   //print prompt
            }
        }
        else{                                           //runs if input wasn't of an int form
                System.out.print("Sorry, you did not enter an integer. Try again: ");    //print prompt to try again
                myScanner.next();                       //take next input
        }
        }
        
        System.out.print("Enter the length of the matrix:  ");  //message prompt
        int inLength = 0;                                   //initialize variable to store entered length
        while(true){                                        //loop that always runs to check if nputs is correct
        if(myScanner.hasNextInt()){                     //check if input is of int form
            inLength = myScanner.nextInt();             //store entered input
            if(inLength>0){                               //check if entered input is within acceptable range
                break;
            }
            else{                                       //runs if input was not within acceptable range
                System.out.print("Please only enter positive integer. Try again: ");   //print prompt
            }
        }
        else{                                           //runs if input wasn't of an int form
                System.out.print("Sorry, you did not enter an integer. Try again: ");    //print prompt to try again
                myScanner.next();                       //take next input
        }
        }
        
        
        int[][] matr1 = randomMatrix(inWidth, inLength);                        //store randomly generated matrix from the randomMatrix method
        System.out.println("Original Matrix: ");                                //print line with message
        printMatrix(matr1);                                                     //print the matr1 generated above
        int[][] matr2 = transposeMatrix(matr1, inWidth, inLength);              //transpose the previously randomly geenrated matrix and store it as matr2
        System.out.println("Transposed Matrix: ");                                //print line with message
        printMatrix(matr2);                                                     //print the matrix transposed
        

        
    }
    
    
    public static int[][] randomMatrix(int width, int height){              //method that generates numbers to fill in the matrix with       
        int[][] matr = new int[width][height];                              //initialize a multidimensional matrix
        for(int i=0; i<matr.length; i++){                                   //loop that goes through the length of matrix
            for(int j=0; j<matr[i].length; j++){                            //loop that goes through the width of matrix
                matr[i][j] = (int) (Math.random()*21)-10;                  //generates a random number from -10 to 10
            }
        }
        return matr;                                                     //returns matrix
    }
    
    public static void printMatrix(int matr[][]){                       //method tthat prints a matrix
        for (int i=0; i<matr.length; i++){                               //loop that goes through the length of matrix
            for (int j=0; j<matr[i].length; j++){                       //loop that goes through the width of matrix
                if(i>0){
                    if(matr[0].length != matr[i].length){
                        System.out.println("The matrix is not rectangular. Please try again.");
                        return;
                    }
                }
                System.out.print(matr[i][j]+"\t");                      //print an integer and tab
            }
            System.out.println();                                       //print on next line when finished the row
        }
    }
    
    public static int[][] transposeMatrix(int matr[][], int width, int length){         //method that transpose the matrix
        int[][] placeHolder = new int[length][width];                                           //initialized array that is used to store transposed matrix
        for(int i=0; i<placeHolder.length; i++){                                                     //loop that goes through the length of matrix
            for(int j=0; j<placeHolder[0].length; j++){                                                //loop that goes through the width of matrix
                placeHolder[i][j] = matr[j][i];                                         //swaps the numbers
            }
        }
        return placeHolder;                                                             //return the transposed matri
    }
}