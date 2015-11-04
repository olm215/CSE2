/////////////////////
//Oleh Makukh
//10/30/2015
//CSE2
//HW 10 - Shuffling
//The program that can calculate the area of three different shapes; a rectangle, a triangle and a circle.
//

import java.util.Scanner;     //import class to accept user input

//
// Main program Check begins here
//

public class Shuffling{
 //main method required for every Java program
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
    //suits club, heart, spade or diamond
     String[] suitNames={"C","H","S","D"};   
     String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
     String[] cards = new String[52];
     String[] hand = new String[5];
     for (int i=0; i<52; i++){
        cards[i]=rankNames[i%13]+suitNames[i/13];
//        System.out.print(cards[i]+" ");         // do not need as it double prints
     }
     
     printArray(cards);                          //call method to print an array of cards in order
     System.out.println("Shuffled");            //print a message
     shuffle(cards);                            //call method to shuffle cards
     printArray(cards);                         //call method to print an array of shuffled cards
     hand = randomizeHand(cards);               //call method to pick 5 random cards from the full deck
     System.out.println("Randomized Hand!");    //print a message
     printArray(hand);                          //call method to print and array of 5 cards selected as hand
  }
  public static void printArray(String[] cards){  //prints cards that are located in array
      int len = cards.length;                     //determine length of array to go through all of it in for loop
      for(int i=0; i<len; i++){                   //for loop goes through all the cards and print them
      System.out.print(cards[i] + " ");           //prints a card at position i in an array cards and space
      }
      System.out.println();                       //print a line
  }
  
  public static void shuffle(String[] cards){   //shuffles the cards in a random order
      int len = cards.length;                   //determine length of an array
      int rand = 0;                             //initialize an int variable to store random number generated
      String placeHolder = null;                //initialize random string variable to hold the value of card in
      for(int i=0; i<len; i++){                 //for loop that shuffles cards
       rand = (int) (Math.random()*51)+1;       //generates a random number from 1 to 52
       placeHolder = cards[0];                  //puts card at first spot in an narray into place holder variable
       cards[0] = cards[rand];                  //assigns new string to position 0 of an array
       cards[rand] = placeHolder;               //place hodler assignments placed back into card array
       }
  }
  
  public static String[] randomizeHand(String[] cards){  //method that gives outs a hand of 5 random cards
      int rand = 0;                              //initialize an int variable to generate a random number
      String placeHolder = null;                 //initialize random string variable to hold the value of card in
      String[] hand = new String[5];             //initialize string of 5 elements to store cards in
      for(int i=0; i<5; i++){                    //for loop used to generate 5 cards
       rand = (int) (Math.random()*51)+1;        //generate a random number from 1 to 52
       placeHolder = cards[rand];                //put a card at array rand into a string placeHolder
       if(placeHolder != hand[0] || placeHolder != hand[1] || placeHolder != hand[2] || placeHolder != hand[3] || placeHolder != hand[4])   //check that the string isn't the same as previously 
       hand[i] =  cards[rand];                   //saves random string into hand array
       }
       return hand;                              //returns an array of 5 cards back to main program
  }  
  
  
}
        