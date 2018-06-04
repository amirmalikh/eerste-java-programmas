package be.vdab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MijnFuncties {
    public static void main(String[] args) {

        double a = 5;
        int b = 3;

        double berekening = a / b;

        System.out.println(Math.round(berekening));


        DecimalFormat f = new DecimalFormat("#0.00");
        System.out.println(f.format(berekening));

        System.out.print("Wat is je naam? ");
        Scanner userInput = new Scanner(System.in);
        String username = userInput.nextLine();

        System.out.println("Hello " + username);

    }
}
