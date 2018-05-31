import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

      /*  System.out.println("Geef het minimumgetal in: ");
        Scanner scanMin = new Scanner(System.in);
        int min = scanMin.nextInt();

        System.out.println("Geef het maximumgetal in: ");
        Scanner scanMax = new Scanner(System.in);
        int max = scanMax.nextInt();
*/
        int min = 1;
        int max = 10;
        int beurten = 3;
        int random =((int)(Math.random() * ((max - min) +1 )) + min);

        int guess = 95;
        int teller = 0;
        boolean res = true;
        boolean win = false;


        while (win == false && teller<beurten) {
            teller++;
            System.out.println("Voer een getal in: ");
            Scanner guessScan = new Scanner(System.in);
            guess = guessScan.nextInt();

            if (guess == random) {
                win = true;
                System.out.println("Gewonnen !!!");
            } else if (guess < random) {
                System.out.println("Te laag");
            } else if (guess > random) {
                System.out.println("Te hoog");
            }
        }
        System.out.println("Game over");

        }
    }
