import java.util.Scanner;

public class InchesToFeet {

    public static void main(String[] args){

        int numInches;
        int numFeet;
        int inchesRemaining;
        int NUM_INCHES_IN_FEET = 12;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of inches >>> ");
        numInches = keyboard.nextInt();

        numFeet = numInches / NUM_INCHES_IN_FEET;

        inchesRemaining = numInches % NUM_INCHES_IN_FEET;

        System.out.println( + numInches + " inches becomes " + numFeet + " feet "  + inchesRemaining + " inches " );



    }
}
