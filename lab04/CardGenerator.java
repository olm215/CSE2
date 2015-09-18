/////////////////////
//Oleh Makukh
//09/18/2015
//CSE2
//Lab 4 - Card Generator
//The program that that will pick a random card from the deck so you can 
//practice your magic tricks alone. 
//

//
// Main program Check begins here
//

public class CardGenerator{
 //main method required for every Java program
    public static void main(String[] args){
    int card = (int)(Math.random()*13)+1;  // generate random card numbered 1 to 14
    int cardType = (int)(Math.random()*3)+1; //generate number from 1 to 4
    String finalCard = "";         //varaible that defines cards above 10(Jack,Queen, King, Ace)
    switch(card){                 //sets the card value for cards above 10
        case 11:                  
            finalCard = "Jack";
            break;
        case 12:
            finalCard = "Queen";
            break;
        case 13:
            finalCard = "King";
            break;
        case 14: 
            finalCard= "Ace";
            break;
    }
    if(card<11){              //print final statements for cards that have value of 10 or below
        switch(cardType){
            case 1:
            System.out.println("You picked the " + card + " of Clubs");
            break;
            case 2:
            System.out.println("You picked the " + card + " of Hearts");
            break;
            case 3:
            System.out.println("You picked the " + card + " of Spades"); 
            break;
            case 4:
            System.out.println("You picked the " + card + " of Diamonds");
            break;
        }
    }
    else{              //print final statements for cards that have value above 10
        switch(cardType){
            case 1:
            System.out.println("You picked the " + finalCard + " of Clubs");
            break;
            case 2:
            System.out.println("You picked the " + finalCard + " of Hearts");
            break;
            case 3:
            System.out.println("You picked the " + finalCard + " of Spades");
            break;
            case 4:
            System.out.println("You picked the " + finalCard + " of Diamonds"); 
            break;
        }        
    }

            
    }
}
