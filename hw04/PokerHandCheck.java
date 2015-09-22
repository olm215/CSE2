/////////////////////
//Oleh Makukh
//09/22/2015
//CSE2
//HW 4 - Poker Hand Check
//The program that generates a set of 5 playin cards, each from different shuffled deck
//and detects whether the five cards contain a pair, two pair, or three of a kind.
//If neither, it reports that you have a “high card hand”
//


//
// Main program Check begins here
//

public class PokerHandCheck{
 //main method required for every Java program
    public static void main(String[] args){ 
     int card1 = (int)(Math.random()*13)+2;  // generate random number from 2 to 14 to deterine card
     int cardType1 = (int)(Math.random()*4)+1; //generate number from 1 to 4 to determine card type
     int card2 = (int)(Math.random()*13)+2;  // generate random number from 2 to 14 to deterine card
     int cardType2 = (int)(Math.random()*4)+1; //generate number from 1 to 4 to determine card type
     int card3 = (int)(Math.random()*13)+2;  // generate random number from 2 to 14 to deterine card
     int cardType3 = (int)(Math.random()*4)+1; //generate number from 1 to 4 to determine card type     
     int card4 = (int)(Math.random()*13)+2;  // generate random number from 2 to 14 to deterine card
     int cardType4 = (int)(Math.random()*4)+1; //generate number from 1 to 4 to determine card type     
     int card5 = (int)(Math.random()*13)+2;  // generate random number from 2 to 14 to deterine card
     int cardType5 = (int)(Math.random()*4)+1; //generate number from 1 to 4 to determine card type
     
    String finalCard1 = "";         //varaible that defines cards above 10(Jack,Queen, King, Ace)
    String finalCard2 = "";         //varaible that defines cards above 10(Jack,Queen, King, Ace)
    String finalCard3 = "";         //varaible that defines cards above 10(Jack,Queen, King, Ace)
    String finalCard4 = "";         //varaible that defines cards above 10(Jack,Queen, King, Ace)
    String finalCard5 = "";         //varaible that defines cards above 10(Jack,Queen, King, Ace)
   
    switch(card1){                 //sets the card value for cards above 10
        case 11:                   
            finalCard1 = "Jack";   //if card1=11, set it to jack  
            break;                 //get out of this switch statement
        case 12:
            finalCard1 = "Queen";  //if card1=12, set it to queen
            break;                 //get out of this switch statement
        case 13:
            finalCard1 = "King";   //if card1=13, set it to king
            break;                 //get out of this switch statement
        case 14: 
            finalCard1 = "Ace";    //if card1=14, set it to ace
            break;                 //get out of this switch statement
    }   
    
    switch(card2){                 //sets the card value for cards above 10
        case 11:                   //repeats same commands as for card1, see comments above
            finalCard2 = "Jack";
            break;
        case 12:
            finalCard2 = "Queen";
            break;
        case 13:
            finalCard2 = "King";
            break;
        case 14: 
            finalCard2 = "Ace";
            break;
    }   
    
    switch(card3){                 //sets the card value for cards above 10
        case 11:                   //repeats same commands as for card1, see comments above                  
            finalCard3 = "Jack";
            break;
        case 12:
            finalCard3 = "Queen";
            break;
        case 13:
            finalCard3 = "King";
            break;
        case 14: 
            finalCard3 = "Ace";
            break;
    }   
    
    switch(card4){                 //sets the card value for cards above 10
        case 11:                   //repeats same commands as for card1, see comments above                  
            finalCard4 = "Jack";
            break;
        case 12:
            finalCard4 = "Queen";
            break;
        case 13:
            finalCard4 = "King";
            break;
        case 14: 
            finalCard4 = "Ace";
            break;
    }   
    
    switch(card5){                 //sets the card value for cards above 10
        case 11:                   //repeats same commands as for card1, see comments above                  
            finalCard5 = "Jack";
            break;
        case 12:
            finalCard5 = "Queen";
            break;
        case 13:
            finalCard5 = "King";
            break;
        case 14: 
            finalCard5 = "Ace";
            break;
    }  
    
    System.out.println("Your random cards were:");    //print statement to list cards "randomized"
    
    if(card1<11){              //print final statements for cards that have value of 10 or below
        switch(cardType1){
            case 1:
            System.out.println("   the " + card1 + " of Clubs");
            break;
            case 2:
            System.out.println("   the " + card1 + " of Hearts");
            break;
            case 3:
            System.out.println("   the " + card1 + " of Spades"); 
            break;
            case 4:
            System.out.println("   the " + card1 + " of Diamonds");
            break;
        }
    }
    else{              //print final statements for cards that have value above 10
        switch(cardType1){
            case 1:
            System.out.println("   the " + finalCard1 + " of Clubs");
            break;
            case 2:
            System.out.println("   the " + finalCard1 + " of Hearts");
            break;
            case 3:
            System.out.println("   the " + finalCard1 + " of Spades");
            break;
            case 4:
            System.out.println("   the " + finalCard1 + " of Diamonds"); 
            break;
        }        
    }
    
    if(card2<11){              //print final statements for cards that have value of 10 or below
        switch(cardType1){
            case 1:
            System.out.println("   the " + card2 + " of Clubs");
            break;
            case 2:
            System.out.println("   the " + card2 + " of Hearts");
            break;
            case 3:
            System.out.println("   the " + card2 + " of Spades"); 
            break;
            case 4:
            System.out.println("   the " + card2 + " of Diamonds");
            break;
        }
    }
    else{              //print final statements for cards that have value above 10
        switch(cardType2){
            case 1:
            System.out.println("   the " + finalCard2 + " of Clubs");
            break;
            case 2:
            System.out.println("   the " + finalCard2 + " of Hearts");
            break;
            case 3:
            System.out.println("   the " + finalCard2 + " of Spades");
            break;
            case 4:
            System.out.println("   the " + finalCard2 + " of Diamonds"); 
            break;
        }        
    }    

    if(card3<11){              //print final statements for cards that have value of 10 or below
        switch(cardType3){
            case 1:
            System.out.println("   the " + card3 + " of Clubs");
            break;
            case 2:
            System.out.println("   the " + card3 + " of Hearts");
            break;
            case 3:
            System.out.println("   the " + card3 + " of Spades"); 
            break;
            case 4:
            System.out.println("   the " + card3 + " of Diamonds");
            break;
        }
    }
    else{              //print final statements for cards that have value above 10
        switch(cardType3){
            case 1:
            System.out.println("   the " + finalCard3 + " of Clubs");
            break;
            case 2:
            System.out.println("   the " + finalCard3 + " of Hearts");
            break;
            case 3:
            System.out.println("   the " + finalCard3 + " of Spades");
            break;
            case 4:
            System.out.println("   the " + finalCard3 + " of Diamonds"); 
            break;
        }        
    }

    if(card4<11){              //print final statements for cards that have value of 10 or below
        switch(cardType4){
            case 1:
            System.out.println("   the " + card4 + " of Clubs");
            break;
            case 2:
            System.out.println("   the " + card4 + " of Hearts");
            break;
            case 3:
            System.out.println("   the " + card4 + " of Spades"); 
            break;
            case 4:
            System.out.println("   the " + card4 + " of Diamonds");
            break;
        }
    }
    else{              //print final statements for cards that have value above 10
        switch(cardType4){
            case 1:
            System.out.println("   the " + finalCard4 + " of Clubs");
            break;
            case 2:
            System.out.println("   the " + finalCard4 + " of Hearts");
            break;
            case 3:
            System.out.println("   the " + finalCard4 + " of Spades");
            break;
            case 4:
            System.out.println("   the " + finalCard4 + " of Diamonds"); 
            break;
        }        
    }    
    
    if(card5<11){              //print final statements for cards that have value of 10 or below
        switch(cardType5){
            case 1:
            System.out.println("   the " + card5 + " of Clubs");
            break;
            case 2:
            System.out.println("   the " + card5 + " of Hearts");
            break;
            case 3:
            System.out.println("   the " + card5 + " of Spades"); 
            break;
            case 4:
            System.out.println("   the " + card5 + " of Diamonds");
            break;
        }
    }
    else{              //print final statements for cards that have value above 10
        switch(cardType5){
            case 1:
            System.out.println("   the " + finalCard5 + " of Clubs");
            break;
            case 2:
            System.out.println("   the " + finalCard5 + " of Hearts");
            break;
            case 3:
            System.out.println("   the " + finalCard5 + " of Spades");
            break;
            case 4:
            System.out.println("   the " + finalCard5 + " of Diamonds"); 
            break;
        }        
    }    
    boolean checkForPair1 = card1 == card2;            //true or false check between cards to find a matching pair
    boolean checkForPair2 = card1 == card3;            //true or false check between cards to find a matching pair
    boolean checkForPair3 = card1 == card4;            //true or false check between cards to find a matching pair
    boolean checkForPair4 = card1 == card5;            //true or false check between cards to find a matching pair
    boolean checkForPair5 = card2 == card3;            //true or false check between cards to find a matching pair
    boolean checkForPair6 = card2 == card4;            //true or false check between cards to find a matching pair
    boolean checkForPair7 = card2 == card5;            //true or false check between cards to find a matching pair
    boolean checkForPair8 = card3 == card4;            //true or false check between cards to find a matching pair
    boolean checkForPair9 = card3 == card5;            //true or false check between cards to find a matching pair
    boolean checkForPair10 = card4 == card5;           //true or false check between cards to find a matching pair
    
    boolean checkForThree1 = (card1==card2)&&(card2==card3);   //true or false check between 3 cards
    boolean checkForThree2 = (card1==card2)&&(card2==card4);   //true or false check between 3 cards
    boolean checkForThree3 = (card1==card2)&&(card2==card5);   //true or false check between 3 cards
    boolean checkForThree4 = (card1==card3)&&(card3==card4);   //true or false check between 3 cards
    boolean checkForThree5 = (card1==card3)&&(card3==card5);   //true or false check between 3 cards
    boolean checkForThree6 = (card1==card4)&&(card4==card5);   //true or false check between 3 cards
    boolean checkForThree7 = (card2==card3)&&(card3==card4);   //true or false check between 3 cards
    boolean checkForThree8 = (card2==card3)&&(card3==card5);   //true or false check between 3 cards
    boolean checkForThree9 = (card2==card4)&&(card4==card5);   //true or false check between 3 cards
    boolean checkForThree10 = (card3==card4)&&(card4==card5);  //true or false check between 3 cards
    
    
    //check for presence of three cards of same value
    if(checkForThree1||checkForThree2||checkForThree3||checkForThree4||checkForThree5||checkForThree6||checkForThree7
    ||checkForThree8||checkForThree9||checkForThree10){
        System.out.println("You have three of a kind!");     //if true, print this statement out 
    }     
    //check for presence of three cards of same value
    //if statement to check whether there is a presence of two pairs in a hand of 5 cards, all combinations of pairs are checked
    else if(checkForPair1&&checkForPair2||checkForPair1&&checkForPair3||checkForPair1&&checkForPair4||checkForPair1&&checkForPair5
    ||checkForPair1&&checkForPair6||checkForPair1&&checkForPair7||checkForPair1&&checkForPair8||checkForPair1&&checkForPair9
    ||checkForPair1&&checkForPair10||checkForPair2&&checkForPair3||checkForPair2&&checkForPair4||checkForPair2&&checkForPair5
    ||checkForPair2&&checkForPair6||checkForPair2&&checkForPair7||checkForPair2&&checkForPair8||checkForPair2&&checkForPair9
    ||checkForPair2&&checkForPair10||checkForPair3&&checkForPair4||checkForPair3&&checkForPair5||checkForPair3&&checkForPair6
    ||checkForPair3&&checkForPair7||checkForPair3&&checkForPair8||checkForPair3&&checkForPair9||checkForPair3&&checkForPair10
    ||checkForPair4&&checkForPair5||checkForPair4&&checkForPair6||checkForPair4&&checkForPair7||checkForPair4&&checkForPair8
    ||checkForPair4&&checkForPair9||checkForPair4&&checkForPair10||checkForPair5&&checkForPair6||checkForPair5&&checkForPair7
    ||checkForPair5&&checkForPair8||checkForPair5&&checkForPair9||checkForPair5&&checkForPair10||checkForPair6&&checkForPair7
    ||checkForPair6&&checkForPair8||checkForPair6&&checkForPair9||checkForPair6&&checkForPair10||checkForPair7&&checkForPair8
    ||checkForPair7&&checkForPair9||checkForPair7&&checkForPair10||checkForPair8&&checkForPair9||checkForPair8&&checkForPair10
    ||checkForPair8&&checkForPair10){
         System.out.println("You have two pairs!");        //if only one pair of cards present, print this statement out        
    }
    
    //check for a presence of single pair, only runs if no double pair was found above
    else if(checkForPair1||checkForPair2||checkForPair3||checkForPair4||checkForPair5||checkForPair6||checkForPair7||checkForPair8||checkForPair9||checkForPair10){
        System.out.println("You have a pair!");        //if only one pair of cards present, print this statement out 
    }
    
    else{
        System.out.println("You have a high card hand!");   //if no pairs found, print this statement out 
    }
    
 }
}
    