import java.util.Scanner;

public class QuartToGallonsInteractive {

    public static void main(String[] args){
        int numQuarts;
        int numGallons;
        int quartsRemaining;
        int NUM_QUARTS_IN_GALLON = 4;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of quarts you have >>> ");
        numQuarts = keyboard.nextInt();

        numGallons = numQuarts / NUM_QUARTS_IN_GALLON;

        quartsRemaining = numQuarts % NUM_QUARTS_IN_GALLON;

        System.out.println("The number of gallons is " + numGallons + " with " +
                quartsRemaining + " quarts remaining.");

    }
}
