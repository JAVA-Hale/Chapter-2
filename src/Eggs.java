import java.util.Scanner;

public class Eggs {
    public static void main(String[] args){

        double dozenEggs = 3.25;
        double singleEgg = .45;
        double numEggs;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of eggs you want to buy >>> ");
        numEggs = keyboard.nextInt();

        numEggs = dozenEggs + singleEgg;

        System.out.println("You ordered " + numEggs + " eggs. That's");
    }
}
