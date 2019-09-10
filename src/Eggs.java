import java.util.Scanner;

public class Eggs {
    public static void main(String[] args){

        double dozenPrice = 3.25;
        double singlePrice = .45;
        double eggs;

        int DozenEggs = 12;
        int dozen;
        int leftOver;
        double Total;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of eggs you want to buy >>> ");
        eggs = keyboard.nextInt();
        dozen = (int) (eggs / DozenEggs);
        leftOver = (int) (eggs % DozenEggs);
        Total = dozen * dozenPrice + leftOver * singlePrice;

        System.out.println("The total dozen you ordered is " + dozen + " eggs. The eggs left over are "
                + leftOver + " The total amount is " + Total );
    }
}
