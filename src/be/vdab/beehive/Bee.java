package be.vdab.beehive;

public abstract class Bee extends Insect {

    protected String name;

    public Bee() {
        this.name = "Honey Bunny";
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    public Bee(String name) {
        System.out.println("constructor met naam " + name);
        this.name = name;
    }


    public void fly() {
        System.out.println("Bee " + name + " is flying around: Buzzzzzzz");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Bee " + name;
    }

    public int hashCode() {
        return name.hashCode() * 97;
    }
}
