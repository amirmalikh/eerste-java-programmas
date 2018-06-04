package be.vdab;

import java.math.BigInteger;
import java.util.Scanner;

public class BerekenFaculteit {
    public static void main(String[] args) {

        int fac = 1;

        System.out.println("Geef een getal in: ");
        Scanner userInput = new Scanner(System.in);
        int input = userInput.nextInt();

        for (int i = 1; i <= input; i++) {
            fac = fac * i;

        }
        System.out.println("De faculteit van " + input + " is " + fac);
    }
}

