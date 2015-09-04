/////////////////////
//Oleh Makukh
//CSE02 HW #2
//Arithmetic Class Java Program
//

// define a class
public class Arithmetic{
    
    
// add main method
public static void main(String[] args){
    
    //Number of pairs of socks
    int nSocks=3;
    //Cost per pair of socks
    //(‘$’ is part of the variable name)
    double sockCost$=2.58;
    
    //Number of drinking glasses
    int nGlasses=6;
    //Cost per glass
    double glassCost$=2.29;
    
    //Number of boxes of envelopes
    int nEnvelopes=1;
    //cost per box of envelopes
    double envelopeCost$=3.25;
    //tax on purchase
    double taxPercent=0.06;
    
    
    //total cost of each kind of item and sales tax for that respective total cost
    double totalCostSocks$= nSocks * sockCost$;
    double taxOnSocks$= taxPercent * totalCostSocks$;
    double totalCostGlass$= nGlasses * glassCost$;
    double taxOnGlass$= taxPercent * totalCostGlass$;
    double totalCostEnvBoxes$= nEnvelopes * envelopeCost$;
    double taxOnEnvBoxes$= taxPercent * totalCostEnvBoxes$;
    
    //total cost of purchases before tax
    double totalCostAll$= totalCostSocks$+ totalCostGlass$ + totalCostEnvBoxes$;
    
    //total sales tax paid for total purchase
    double totalTax$= totalCostAll$ * taxPercent;
    // double casting to get a result up to 2 decimal points
    totalTax$= ((int) (totalTax$*100)) / 100.0;          
    
    //total actually paid including sales taxes
    double totalCostWithTax$= totalCostAll$ + (totalCostAll$ * taxPercent);
    // double casting to get a result up to 2 decimal points
    totalCostWithTax$= ((int) (totalCostWithTax$*100)) / 100.0;
    
    
    System.out.println("\n The shopping list includes:\n");
    System.out.println("  " + nSocks      + " pairs of socks priced at $" + sockCost$     + " each, for the total of $" + totalCostSocks$     + ".");
    System.out.println("  " + nGlasses    + " glasses priced at $" + glassCost$    + " each, for the total of $" + totalCostGlass$   + ".");
    System.out.println("  " + nEnvelopes  + " envelope(s) priced at $" + envelopeCost$ + " each, for the total of $" + totalCostEnvBoxes$  + ". \n");
    System.out.println(" Total cost before taxes: $"  + totalCostAll$   + ".");
    System.out.println(" Total taxes:              $"  + totalTax$ + ".");
    System.out.println(" Total cost after  taxes: $"  + totalCostWithTax$    + ". \n");
        
        
        
    }
    
}