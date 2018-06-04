package be.vdab.beehive;

public class Beehive {
    public static void main(String[] args) {


        Worker maya = new Worker(30, 10);
        maya.gatherNectar();

        Worker willy = new Worker(35, 0);
        willy.gatherNectar();

        Soldier sylvester = new Soldier(150,20,20,20);

        Soldier arnold = new Soldier(120,30,25,30);
        arnold.attack(sylvester);

        Soldier jimi = new Soldier(130,25,30,25);

        if (arnold.isDead() || sylvester.isDead()) {
            if (arnold.isDead()) {

                System.out.println("ARNOLD");
            } else {
                System.out.println("SYLVESTER");
            }
        } else {
            System.out.println("DRAW");

        }


    }

}
