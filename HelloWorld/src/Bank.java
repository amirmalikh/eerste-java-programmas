public class Bank {
    public static void main(String[] args) {

        double startKapitaal = 100000;
        double termijn = 10;
        double rente = 1.035;
        double kapitaal = startKapitaal;

        for (int teller = 1; teller <= termijn; teller++) {
            System.out.println("Uw kapitaal na " + teller + " jaar is " + (kapitaal = kapitaal * rente));
        }


    }

}




