import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args){
        String color;
        String WordEst;
        String bodyPart;
        String animal;
        String noun;
        String pluralNoun;



        int a = 2;
        int b = 4;
        int c;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a color >>> ");
        color = input.nextLine();
        System.out.println("Enter a Word ending in EST >>> ");
        WordEst = input.nextLine();
        System.out.println("Enter a plural body part >>> ");
        bodyPart = input.nextLine();
        System.out.println("Enter a animal >>> ");
        animal = input.nextLine();
        System.out.println("Enter a noun >>> ");
        noun = input.nextLine();
        System.out.println("Enter a plural noun >>> ");
        pluralNoun = input.nextLine();


        c = a % b;

        System.out.println("The " + color + " Dragon is the " + WordEst + " Dragon of all. ");
        System.out.println("It has " + c + " "+ bodyPart + ", and a " + animal + " shaped like a " + noun + ".");
        System.out.println("It loves to eat " + pluralNoun + ", although it will feast on nearly anything." );

    }
}
