import java.util.Scanner;

public class Leeftijd {
    public static void main(String[] args) {

        int geboortejaar = 1991;
        int huidigJaar = 2018;

        System.out.print("Welk jaar ben je geboren? ");
        Scanner userInput = new Scanner(System.in);
        String year = userInput.nextLine();
        System.out.println("Je bent " + (huidigJaar-geboortejaar) + " jaar oud");


    }


}