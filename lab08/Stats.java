/////////////////////
//Oleh Makukh
//10/16/2015
//CSE2
//Lab 8 - Methods
//The a programwhose main method asks the user to input 5 doubles, from smallest to largest. 
// After recording the inputs, compute the mean of the 5 doubles,
//the median of the 5 doubles, and then print out the mean and the median.
 

import java.util.Scanner;     //import class to accept user input

//
// Main program Check begins here
//

public class Stats{
    
    public static double calcMean(double input1,double input2,double input3,double input4,double input5){
        double mean = (input1+input2+input3+input4+input5)/5;
        return mean;
    }
    
    public static double calcMedian(double input3){
        return input3;
    }

    public static void printOut(double mean,double median){
        System.out.println("Mean is " + mean);
        System.out.println("Median is " + median);

    }    
 //main method required for every Java program
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);   //allows to prompt user for input
        System.out.println("Input 5 doubles,from smallest to largest.");  //message prompt
        System.out.print("Input a first double:  ");  //message prompt
        double input1 = myScanner.nextDouble();                                 //initialize variable to store entered length        
        System.out.print("Input a second double:  ");  //message prompt        
        double input2 = 0;
        while(true){
            input2 = myScanner.nextDouble();
            if(input2>input1){
                break;
            }
            else{
                System.out.print("Please enter a larger number than first one: ");
            }
        }
        System.out.print("Input a third double:  ");  //message prompt          
        double input3 = 0;        
        while(true){
            input3 = myScanner.nextDouble();
            if(input3>input2){
                break;
            }
            else{
                System.out.print("Please enter a larger number than second one: ");
            }
        }
        System.out.print("Input a fourth double:  ");  //message prompt          
        double input4 = 0;        
        while(true){
            input4 = myScanner.nextDouble();
            if(input4>input3){
                break;
            }
            else{
                System.out.print("Please enter a larger number than third one: ");
            }
        }
        System.out.print("Input a fifth double:  ");  //message prompt          
        double input5 = 0;        
        while(true){
            input5 = myScanner.nextDouble();
            if(input5>input4){
                break;
            }
            else{
                System.out.print("Please enter a larger number than fourth one: ");
            }
        }
        
        double prMean = calcMean(input1,input2,input3,input4,input5);
        double prMedian = calcMedian(input3);
        printOut(prMean,prMedian);
    }
}
        