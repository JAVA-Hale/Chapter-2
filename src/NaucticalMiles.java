import java.util.Scanner;

public class NaucticalMiles {

    public static void main(String[] args){
        final double NM_TO_MILES = 1.50779;
        final double NM_TO_KILO = 1.852;
        double NMentered;
        double nauticaltoMiles;
        double nauticaltokilo;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of nautical miles >>> ");
        NMentered = keyboard.nextInt();

        nauticaltokilo = NM_TO_KILO * NMentered;

        nauticaltoMiles = NM_TO_MILES * NMentered;

        System.out.println("The number of miles and kilometers is " + nauticaltoMiles + ".");

        System.out.println("The number of miles and kilometers is " + nauticaltokilo +".");
    }
}
