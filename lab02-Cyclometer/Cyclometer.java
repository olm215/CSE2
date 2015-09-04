/////////////////////
//Oleh Makukh
//09/03/2015
//CSE2
//Lab 2 - Cyclometer
//The program that analyzes bicycle trips
//

public class Cyclometer {
        // main method required for every Java program
       public static void main(String[] args) {
        // our input data.

        int secsTrip1=480;     //the time in minutes of trip 1
        int secsTrip2=3220;    //the time in minutes of trip 2
        int countsTrip1=1561;  //number of counts for trip 2
        int countsTrip2=9037;  //number of counts for trip 2
        
        // our intermediate variables and output data.
        double wheelDiameter=27.0,  //diameter of the wheel
        PI=3.14159,                 //pi number used in circumference
        feetPerMile=5280,           //number of feet in 1 mile
        inchesPerFoot=12,           //number of inches in 1 foot
        secondsPerMinute=60;        //number of seconds in 1 minute
        double distanceTrip1, distanceTrip2,totalDistance;  //output data for distance traveled
        
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+
                 countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+
                 countsTrip2+" counts.");
                 
        //run the calculations; store the values. 
        //Calculating the distance traveled during trip 1 in inches.
        //
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
        //distance traveled during trip 2
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        //total distance for 2 trips
        totalDistance=distanceTrip1+distanceTrip2;  
        
        
        //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
    }  //end of main method   
} //end of class
