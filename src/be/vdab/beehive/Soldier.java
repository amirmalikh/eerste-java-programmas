package be.vdab.beehive;

import java.util.Random;

public class Soldier extends Bee {
    /**
     * The name of our hero.
     */


    /**
     * How many lives left?
     */
    int hitpoints;

    /**
     * Strength of weapon.
     */
    int weapon;

    /**
     * Amount of damage reduced from opponent's weapon strength (mitigates attack).
     */
    int armour;

    /**
     * Constructor.
     */
    public Soldier(String name, int weapon, int armour) {
        super(name);
        this.hitpoints = 100;   // All soldiers start with same hitpoints
        this.weapon = weapon;
        this.armour = armour;
    }

    /**
     * Inflict an attack on target opponent, with 50% attack bonus.
     * Takes damage from target opponent with 50% reduction
     * (e.g. do more damage than taken because you have initiative.
     *
     * @param target The opponent to attack.
     */
    public void attack(Soldier target) {
        int defenderDamage = Math.max(0, (int) (Math.random() * this.weapon * 1.5) - target.armour);

        System.out.print(
                "Attacker " + getName() + " attacks defender " + target.getName() +
                        " dealing " + defenderDamage + " amount of damage causing defender to "
        );
        target.hitpoints -= defenderDamage;
        if (target.isDead()) {
            System.out.println("die");
        } else {
            if (new Random().nextBoolean()) {
                int attackerDamage = Math.max(0, (int) ((Math.random() * target.weapon * 0.5) - this.armour));
                this.hitpoints -= attackerDamage;
                System.out.print("respond with a counter attack dealing " + attackerDamage + " amount of damage causing attacker to ");
                if (this.isDead()) {
                    System.out.println("die");
                } else {
                    System.out.println("take the punch");
                }
            } else {
                System.out.println("buckle");
            }
        }
    }

    /**
     * Checks if player is still alive
     *
     * @return
     */
    public boolean isDead() {
        return hitpoints <= 0;
    }

    @Override
    public void fly() {
        System.out.println("Soldier " + name + " is flying around bravely");
    }
}
