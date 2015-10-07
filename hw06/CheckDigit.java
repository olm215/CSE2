/////////////////////
//Oleh Makukh
//10/06/2015
//CSE2
//HW 6 - BCheck Digit
// Program that acts as an ISBN validator. Prompt the user to enter a 10 digit number
//and using a loop, verify if the number meets the criteria to be a valid ISBN as listed above.
//If the number is not a valid ISBN, determine a check digit that would make the number a valid ISBN. 
//Since numbers divided by 11 can have remainders between 0 and 10, but the check digit can
//only be a single digit number, use the letter X (the Roman numeral 10) to represent a check digit of 10.

import java.util.Scanner;     //import class to accept user input

//
// Main program Check begins here
//

public class CheckDigit{
 //main method required for every Java program
    public static void main(String[] args){ 
        
        Scanner myScanner = new Scanner(System.in);   //allows to prompt user for input
        System.out.print("Please enter a 10 digit barcode:  ");  //message prompt
        String checkISBN=myScanner.nextLine();                        //accept user input
        int lengthISBN = checkISBN.length();
//        boolean check = false;
//        if(lengthISBN == 10){
//            check = true;
        
        while(checkISBN.length() != 10){
            System.out.print("This is NOT a valid ISBN. Please enter 10 digits:  ");
            myScanner.next();                                                   //accepting next input

        }
        int i = 0;
            for(i=0;i<9;i++){
                char checkChar = checkISBN.charAt(i);
                if(checkChar == '0' || checkChar == '1' || checkChar == '2' || checkChar == '3' || checkChar == '4' 
                   || checkChar == '5' || checkChar == '6' || checkChar == '7' || checkChar == '8' || checkChar == '9'){
                    continue;
                }
                else{

                    System.out.print("This is 1NOT a valid ISBN. Please enter 10 digits:  ");
                    myScanner.next();                                                   //accepting next input
                }
            }
            
            char checkChar = checkISBN.charAt(9);
            if(checkChar == 'X' || checkChar == 'x' || checkChar == '0' || checkChar == '1' || checkChar == '2' || checkChar == '3' || checkChar == '4' 
                   || checkChar == '5' || checkChar == '6' || checkChar == '7' || checkChar == '8' || checkChar == '9'){
                       //do nothing, just checking if correct
            }
            else{
                System.out.print("This is 2NOT a valid ISBN. Please enter 10 digits:  ");
                myScanner.next();                                                   //accepting next input
            }
            
            int total,sum = 0;
            int mult = 10;
            for(int j=0;j<9;j++){
                total = mult*(checkISBN.charAt(j)-'0');
                sum +=total;
                mult--;
            }
            int checkSum = sum%11;
            
            if (checkSum == checkChar){
                System.out.print("This is a valid ISBN.");
            }
            else{
                                        System.out.print("GOT OUT  " + sum);

            }
            

        
        
                        System.out.print("GOT OUT  " + sum);


        
        
        
        
    }
}