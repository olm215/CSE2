/////////////////////
//Oleh Makukh
//10/20/2015
//CSE2
//HW 8 - Shapes
//The program that can calculate the area of three different shapes; a rectangle, a triangle and a circle.
//

import java.util.Scanner;     //import class to accept user input

//
// Main program Check begins here
//

public class Area{
 //main method required for every Java program
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);   //allows to prompt user for input
        System.out.print("Input your desired shape(rectangle, triangle or circle):  ");  //message prompt
        String pickShape = null;                                   //initialize variable to store entered string        
        while(true){                                        //loop that always runs to check if nputs is correct
            pickShape = myScanner.nextLine();             //store entered input
            if(pickShape.equals("rectangle") || pickShape.equals("triangle")    //check if input is proper
            || pickShape.equals("circle")){ 
                break;                                  //if so, get out of loop
                }
            else{                                           //runs if input wasn't of string form
                    System.out.print("Please only enter rectangle, triangle, or circle. Try again: ");   //print prompt
            }
        }
        
        if(pickShape.equals("rectangle")){            //run if user input was rectangle
         rectArea();                                  //call method to calculate and print area of the rectangle
        }
        
        if(pickShape.equals("triangle")){             //run if user input was triangle
         triArea();                                  //call method to calculate and print area of the triangle
        }
        
        if(pickShape.equals("circle")){              //run if user input was circle
         circleArea();                               //call method to calculate and print area of the circle
        }
    }
        
    public static double checkInput(){                 //method that check if user inputs a double for sides of shapes
        Scanner myScanner1 = new Scanner(System.in);   //allows to prompt user for input
        double inp = 0;                                //initialize variable used to store input
        while(true){                                        //loop that always runs to check if nputs is correct
            if(myScanner1.hasNextDouble()){                     //check if input is of int form
                inp = myScanner1.nextDouble();             //store entered input
                if(inp>0){                               //check if entered input is within acceptable range
                    break;                                  //if so, get out of loop
                }
                else{                                       //runs if input was not within acceptable range of 0 to 80
                    System.out.print("Please only enter positive double. Try again: ");   //print prompt
                }
            }
            else{                                           //runs if input wasn't of an int form
                    System.out.print("Sorry, you did not enter a positive double number. Try again: ");    //print prompt to try again
                    myScanner1.next();                       //take next input
            }
        }
        return inp;
    }
    
    public static void rectArea(){                                   //method that calculates and prints are of the rectangle
     double a, b = 0;                                                //initiliaze variables used in calculations
     System.out.print("Please input first side of a rectangle: ");   //print prompt for first input
     a = checkInput();                                               //jump to method that chacks if input is a double, and store it as a variable
     System.out.print("Please input second side of a rectangle: ");  //print prompt for another input
     b = checkInput();                                               //jump to method that chacks if input is a double, and store it as a variable
     System.out.println("The area of the rectangle is: "+ a*b);      //print out final message with calculated area
    }

    public static void triArea(){                                   //method that calculates and prints are of the triangle
     double h, l = 0;                                               //initiliaze variables used in calculations
     System.out.print("Please input height of a triangle: ");       //print prompt for first input
     h = checkInput();                                               //jump to method that chacks if input is a double, and store it as a variable
     System.out.print("Please input length of the base of a triangle: ");  //print prompt for another input
     l = checkInput();                                               //jump to method that chacks if input is a double, and store it as a variable
     System.out.println("The area of the rectangle is: "+ h*l/2);      //print out final message with calculated area
    }    
  
    public static void circleArea(){                                 //method that calculates and prints are of the circle
     double r = 0;                                                   //initiliaze variable used in calculations
     System.out.print("Please input radius of a circle: ");          //print prompt for first input
     r = checkInput();                                               //jump to method that chacks if input is a double, and store it as a variable
     System.out.println("The area of the rectangle is: "+ Math.PI * r * r);      //print out final message with calculated area
    }    
}