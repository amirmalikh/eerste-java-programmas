package be.vdab.beehive;

import java.util.Scanner;

public class BeeMain {
    public static void main(String[] args) {
        Bee maya = new Soldier("Arnold", 10, 2);
        maya.fly();

        Worker w = new Worker("Willy", 0, 100);
        w.fly();

        Soldier s = new Soldier("Arnold", 10, 2);
        System.out.println("Resultaat " + s);

        System.out.println(s.hashCode());

        Object o = new Worker("John",10,100);
        Object p = new String("Hello");
        Object q = new Scanner(System.in);

        System.out.println(o.toString());
    }
}
