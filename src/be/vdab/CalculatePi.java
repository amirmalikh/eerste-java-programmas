package be.vdab;

public class CalculatePi {
    public static void main(String[] args) {

        int limit = 1000000000
                ;
        int teken = 1;
        double som = 0;


        for (double i = 1; i <= limit; i += 2) {
            double breuk = (1/i) * teken;
            teken *= -1; // teken = teken * -1
            som += breuk;
        }
        double pi = 4 * som;
        System.out.println(pi);
    }
}
