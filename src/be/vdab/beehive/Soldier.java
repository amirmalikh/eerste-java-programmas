package be.vdab.beehive;

public class Soldier {
    int hitpoints ;
    String weapon;
    int armor ;
    int defence ;
    int attack ;

    public Soldier(int initialHitpoints, int initialArmor, int initialDefence, int initialAttack) {
        hitpoints = initialHitpoints;
        armor = initialArmor;
        defence = initialDefence;
        attack = initialAttack;
    }


    public void attack(Soldier enemy) {
        while (this.hitpoints > 0 && enemy.hitpoints > 0) {
            this.hitpoints -= (enemy.attack * 1.5) - this.armor;
            enemy.hitpoints -= (this.defence * 1.5) - enemy.armor;
        }

        System.out.println("defender hitpoints: " + this.hitpoints );
        System.out.println("enemy hitpoints: " + enemy.hitpoints);
    }

    public boolean isDead() {

        return hitpoints <= 0;


    }

    public int random(int min, int max) {
        int r = ((int) (Math.random() * ((max - min) + 1)) + min);
        return r;

    }

}