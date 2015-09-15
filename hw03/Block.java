/////////////////////
//Oleh Makukh
//09/15/2015
//CSE2
//HW 3 - Block
//The  program that prompts the user for the length, width, and height of a block.
//The program will calculate the volume of the block and the surface area.
//

import java.util.Scanner;

//
// Main program Check begins here
//

public class Block {
    //main method required for every Java program
    public static void main(String[] args) {
        Scanner myBlock = new Scanner(System.in);   //allows to prompt user for input
        System.out.print("Enter the length of the block: ");  //message prompt
        //using method within Scanner class        
        double blockLength = myBlock.nextDouble();  //promt user to enter block's length
        System.out.print("Enter the width of the block: "); //message prompt
        double blockWidth = myBlock.nextDouble();   //promt user to enter block's width 
        System.out.print("Enter the height of the block: "); //message prompt
        double blockHeight = myBlock.nextDouble();   //promt user to enter block's height
        
        double blockVolume;       //specifitying variable as double to store vloume
        double blockSurfarea;     //specifying vairable as double to store surface area
        blockVolume = blockHeight * blockWidth * blockLength;  //volume calculation of the block (H*W*L)
        blockSurfarea = 2*((blockLength*blockWidth)+(blockHeight*blockWidth) + (blockLength*blockHeight));   //surface area calculation of the block (2*(LW+HW+LH))
        System.out.print("The volume of the block of dimensions " + blockLength + " x " + blockWidth + " x " + blockHeight + " is " + blockVolume + ".\n");  //print the volume calculated and go to the next line
        System.out.print("The surface area of the block is " + blockSurfarea + ".\n"); //print the surface area calculated and go to the next line
    } // end of main method
} //end of class    
        
    