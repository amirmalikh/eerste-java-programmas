package be.vdab;

public class HelloWorld {

    public static void main(String[] args) {

        String myName = "Amir";

        float dagloon = 100;
        double aantalDagen = 18.5;
        int aantalKinderen = 2;
        double perKind = 50;
        double treinAbonnement = 150;
        double bruttoloon = dagloon * aantalDagen;
        double kindGeld = aantalKinderen * perKind;
        double nettoloon;
        boolean bedrijfsWagen = false;
        nettoloon = bruttoloon + kindGeld;

        if (bedrijfsWagen == false) {

            nettoloon = nettoloon + treinAbonnement;

        }

        System.out.println("Uw nettoloon bedraagt: " + nettoloon);

    }

}
