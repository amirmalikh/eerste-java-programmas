package be.vdab;

public class PriemgetalStatic {

    public static void main(String[] args) {

        int b = berekenRandomGetal(0,100) ;

        if (isPriem(b)){
            System.out.println("getal " + b + " is een priemgetal"); }

        else
        {
            System.out.println("getal " + b + " is geen priemgetal");
        }

    }
    public static int berekenRandomGetal (int min, int max) {

        int random = ((int) (Math.random() * ((max - min) + 1)) + min);
        return random;
    }
    public static boolean isPriem(int getal) {

        int kandidaat = 2;
        boolean ispriem = true;

        if (getal <= 2 ) { ispriem = false; }
        while (kandidaat < getal) {
            int r = (getal % kandidaat);
            if (r == 0) {
                ispriem = false;
            }
            kandidaat++;
        }

        return ispriem;
    }

}


