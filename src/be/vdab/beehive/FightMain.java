package be.vdab.beehive;

/**
 * Voorbeeld van hoe een computer spelletje zou kunnen werken (met een random "geluk" factor toegevoegd)
 */
public class FightMain {
    public static void main(String[] args) {
        be.vdab.beehive.Soldier arnold = new be.vdab.beehive.Soldier("Arnold", 20, 1);
        be.vdab.beehive.Soldier sylvester = new be.vdab.beehive.Soldier("Sylvester", 15, 6);
        fightToTheDeath(arnold, sylvester);
    }

    public static void fightToTheDeath(be.vdab.beehive.Soldier aggressor, be.vdab.beehive.Soldier defender) {
        int round = 0;
        while(!aggressor.isDead() && !defender.isDead()) {
            System.out.println("ROUND " + ++round);
            printHealth(aggressor);
            printHealth(defender);
            aggressor.attack(defender);
            be.vdab.beehive.Soldier temp = aggressor;
            aggressor = defender;
            defender = temp;
            System.out.println("-----------");
        }
    }

    public static void printHealth(Soldier soldier) {
        System.out.println(soldier.getName() + " -> " + soldier.hitpoints + " hitpoints left.");
    }
}
