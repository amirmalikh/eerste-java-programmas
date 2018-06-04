package be.vdab;

import java.util.Scanner;

public class Priemgetal {
    public static void main(String[] args) {



        System.out.println("Voer een getal in: ");
        Scanner input = new Scanner(System.in);
        int getal = input.nextInt();
        int helft = getal / 2;
        boolean ispriem = true;

        if (getal < 2) {
            ispriem = false;
        } else {
            for (int i = 2; i <= helft; i++) {
                if (getal % i == 0) {
                    ispriem = false;
                }
            }
        }
        if (ispriem) {
            System.out.println("getal " + getal + " is een priemgetal");
        } else {

            System.out.println("getal " + getal + " is een priemgetal");
        }
    }
}

/*

    int n = 13;
    int kandidaat = 2;
    boolean ispriem = true;

    while (kandidaat<n) {
        int r = (n% kandidaat);
      if (r == 0) {
          ispriem = false
      }
        kandidaat ++;
    }
    if (ispriem){
        System.out.println("getal " + n + "is een priemgetal");}
            else
    {
        System.out.println("getal " + n + "is een priemgetal");
    }
    }
}
*/