/////////////////////
//Oleh Makukh
//10/06/2015
//CSE2
//HW 6 - Bar Graph
//The program that prompts you to input the expenses for each day of the week for one week.
//With this input, the program will print a simple bar graph/visualization that represents your weekly expenses
//

import java.util.Scanner;     //import class to accept user input

//
// Main program Check begins here
//

public class BarGraph{
 //main method required for every Java program
    public static void main(String[] args){ 
        Scanner myScanner = new Scanner(System.in);   //allows to prompt user for input
//        System.out.print("Expenses for Monday:      $");  //message prompt
//        double expMon = myScanner.nextDouble();  //promt user to enter monday's expenses
//        System.out.print("Expenses for Tuesday:     $");  //message prompt
//        double expTues = myScanner.nextDouble();  //promt user to enter monday's expenses        
//        System.out.print("Expenses for Wednesday:   $");  //message prompt
//        double expWed = myScanner.nextDouble();  //promt user to enter monday's expenses        
//        System.out.print("Expenses for Thursday:    $");  //message prompt
//        double expThur = myScanner.nextDouble();  //promt user to enter monday's expenses        
//        System.out.print("Expenses for Friday:      $");  //message prompt
//        double expFri = myScanner.nextDouble();  //promt user to enter monday's expenses        
//        System.out.print("Expenses for Saturday:    $");  //message prompt
//        double expSat = myScanner.nextDouble();  //promt user to enter monday's expenses        
//        System.out.print("Expenses for Sunday:      $");  //message prompt
//        double expSun = myScanner.nextDouble();  //promt user to enter monday's expenses        


        System.out.print("Expenses for Monday:      $");  //message prompt
        double expMon = 0;                                                          //declare variable that stores Monday's expenditure
        while(!myScanner.hasNextDouble()){                                          //if number wasn't inputted, run this while loop
                System.out.println("Sorry, you did not enter an integer. Try again: $");    //print prompt to try again
                myScanner.next();                                                   //next try input
            }
        if (myScanner.hasNextDouble()){                                             //if input is detected as double run this
            expMon=myScanner.nextDouble();                                          //place input into Monday's expenditure variable
            while (expMon<0){                                                       //if a number inputted was less than 0, ask to input a postivie number
                System.out.println("Please only enter positive numbers. Try again: $");   //print prompt
                myScanner.next();                                                   //accepting next input
            }
        }
        
        System.out.print("Expenses for Tuesday:     $");  //message prompt
        double expTues = 0;                                                          //declare variable that stores Tuesday's expenditure
        while(!myScanner.hasNextDouble()){                                          //if number wasn't inputted, run this while loop
                System.out.println("Sorry, you did not enter an integer. Try again: $");    //print prompt to try again
                myScanner.next();                                                   //next try input
            }
        if (myScanner.hasNextDouble()){                                             //if input is detected as double run this
            expTues=myScanner.nextDouble();                                          //place input into Tuesday's expenditure variable
            while (expTues<0){                                                       //if a number inputted was less than 0, ask to input a postivie number
                System.out.println("Please only enter positive numbers. Try again: $");   //print prompt
                myScanner.next();                                                   //accepting next input
            }
        }
        
        System.out.print("Expenses for Wednesday:   $");  //message prompt
        double expWed = 0;                                                          //declare variable that stores Wednesday's expenditure
        while(!myScanner.hasNextDouble()){                                          //if number wasn't inputted, run this while loop
                System.out.println("Sorry, you did not enter an integer. Try again: $");    //print prompt to try again
                myScanner.next();                                                   //next try input
            }
        if (myScanner.hasNextDouble()){                                             //if input is detected as double run this
            expWed=myScanner.nextDouble();                                          //place input into Wednesday's expenditure variable
            while (expWed<0){                                                       //if a number inputted was less than 0, ask to input a postivie number
                System.out.println("Please only enter positive numbers. Try again: $");   //print prompt
                myScanner.next();                                                   //accepting next input
            }
        }
        
        System.out.print("Expenses for Thursday:    $");  //message prompt
        double expThur = 0;                                                          //declare variable that stores Thursday's expenditure
        while(!myScanner.hasNextDouble()){                                          //if number wasn't inputted, run this while loop
                System.out.println("Sorry, you did not enter an integer. Try again: $");    //print prompt to try again
                myScanner.next();                                                   //next try input
            }
        if (myScanner.hasNextDouble()){                                             //if input is detected as double run this
            expThur=myScanner.nextDouble();                                          //place input into Thursday's expenditure variable
            while (expThur<0){                                                       //if a number inputted was less than 0, ask to input a postivie number
                System.out.println("Please only enter positive numbers. Try again: $");   //print prompt
                myScanner.next();                                                   //accepting next input
            }
        }
        
        System.out.print("Expenses for Friday:      $");  //message prompt
        double expFri = 0;                                                          //declare variable that stores Friday's expenditure
        while(!myScanner.hasNextDouble()){                                          //if number wasn't inputted, run this while loop
                System.out.println("Sorry, you did not enter an integer. Try again: $");    //print prompt to try again
                myScanner.next();                                                   //next try input
            }
        if (myScanner.hasNextDouble()){                                             //if input is detected as double run this
            expFri=myScanner.nextDouble();                                          //place input into Friday's expenditure variable
            while (expFri<0){                                                       //if a number inputted was less than 0, ask to input a postivie number
                System.out.println("Please only enter positive numbers. Try again: $");   //print prompt
                myScanner.next();                                                   //accepting next input
            }
        }
        
        System.out.print("Expenses for Saturday:    $");  //message prompt
        double expSat = 0;                                                          //declare variable that stores Monday's expenditure
        while(!myScanner.hasNextDouble()){                                          //if number wasn't inputted, run this while loop
                System.out.println("Sorry, you did not enter an integer. Try again: $");    //print prompt to try again
                myScanner.next();                                                   //next try input
            }
        if (myScanner.hasNextDouble()){                                             //if input is detected as double run this
            expSat=myScanner.nextDouble();                                          //place input into Monday's expenditure variable
            while (expSat<0){                                                       //if a number inputted was less than 0, ask to input a postivie number
                System.out.println("Please only enter positive numbers. Try again: $");   //print prompt
                myScanner.next();                                                   //accepting next input
            }
        }
        
        System.out.print("Expenses for Sunday:      $");  //message prompt
        double expSun = 0;                                                          //declare variable that stores Monday's expenditure
        while(!myScanner.hasNextDouble()){                                          //if number wasn't inputted, run this while loop
                System.out.println("Sorry, you did not enter an integer. Try again: $");    //print prompt to try again
                myScanner.next();                                                   //next try input
            }
        if (myScanner.hasNextDouble()){                                             //if input is detected as double run this
            expSun=myScanner.nextDouble();                                          //place input into Monday's expenditure variable
            while (expSun<0){                                                       //if a number inputted was less than 0, ask to input a postivie number
                System.out.println("Please only enter positive numbers. Try again: $");   //print prompt
                myScanner.next();                                                   //accepting next input
            }
        }               
        



        double avg= (expMon+expTues+expWed+expThur+expFri+expSat+expSun)/7 ;     //calculate average expenditure in a week   
        System.out.print("\n");                                                  //print blank line
        System.out.print("Mon:  ");                                              //print prompt
        while(expMon>=0.5){                                                      //check if expendite for this day exceeds 50 cents.    
            System.out.print("*");                                               //if so, print *
            expMon--;                                                            //decrement expenditure by 1 dollar
        }

        System.out.print("\n");                                                  //print blank line
        System.out.print("Tues: ");                                              //print prompt
        while(expTues>=0.5){                                                     //check if expendite for this day exceeds 50 cents.    
            System.out.print("*");                                               //if so, print *
            expTues--;                                                           //decrement expenditure by 1 dollar
        }
        
        System.out.print("\nWed:  ");                                            //print blank line and prompt for day
        while(expWed>=0.5){                                                      //check if expendite for this day exceeds 50 cents.    
            System.out.print("*");                                               //if so, print *
            expWed--;                                                            //decrement expenditure by 1 dollar
        }
        
        System.out.print("\nThu:  ");                                            //print blank line and prompt for day
        while(expThur>=0.5){                                                     //check if expendite for this day exceeds 50 cents.    
            System.out.print("*");                                               //if so, print *
            expThur--;                                                           //decrement expenditure by 1 dollar
        }
                        
        System.out.print("\nFri:  ");                                            //print blank line and prompt for day
        while(expFri>=0.5){                                                      //check if expendite for this day exceeds 50 cents.    
            System.out.print("*");                                               //if so, print *
            expFri--;                                                            //decrement expenditure by 1 dollar
        }
                
        System.out.print("\nSat:  ");                                            //print blank line and prompt for day
        while(expSat>=0.5){                                                      //check if expendite for this day exceeds 50 cents.    
            System.out.print("*");                                               //if so, print *
            expSat--;                                                            //decrement expenditure by 1 dollar
        }
        
        System.out.print("\nSun:  ");                                            //print blank line and prompt for day
        while(expSun>=0.5){                                                      //check if expendite for this day exceeds 50 cents.    
            System.out.print("*");                                               //if so, print *
            expSun--;                                                            //decrement expenditure by 1 dollar
        }
        System.out.print("\n\n");                                                //print 2 blank lines

        System.out.printf("Your average daily expenses are:  $ %.2f\n", avg);    //print out message with calcluated average precisely to 2 decimal points
        
        double totalAll = 0;                                                      //declare double total to a previously calculated average value
        double totalWeek = 0;
        double expRand = 0;                                                      //declare variable that will be used in while loop to calculate estimated expenditure per week 
        double rand=0;                                                           //declare variable that will store random number that estimates percentage of expenditure
        int week = 0;                                                            //declare conditional variable that will be used in running while loop
        for(week=0;week<209;week++){                                             //while loop will run 208 times, per 208 weeks in 4 years(4*52=208)
            rand = (int)(Math.random()*41)-20;                                   //generate random number in range of -20 to 20, representing fluctuation of estimated expenses
            expRand = (avg*rand);                                                //calculate estimated expenditure for a given day based on random generated number from -20 to 20
            totalWeek = 7*avg + (expRand/100);                                    //calculate estimated expenditure for a given week
            totalAll += totalWeek;
        }
        System.out.printf("Estimated expenditure for 4 years: $ %.2f\n", totalAll);  //print out message with calcluated total expenditure for 4 years precisely to 2 decimal points

    }
} 