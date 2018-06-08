package be.vdab.beehive;

public class Worker extends Bee {

    private int capacity;
   private int load;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;

    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public Worker() {
        this("John Doe", 0, 100);
    }

    public Worker(int load) {
        this("John Doe", load, 100);
    }

    public Worker(String name, int load, int capacity) {
        super(name);
        System.out.println("Create new worker");
        this.capacity = capacity;
        this.load = load;
    }

    /**
     * @return true if capacity remaining, false if full.
     */
    public boolean gatherNectar(Flower f) {
        load += f.nectar;

        System.out.println("Worker "
                + getName() + " visits flower "
                + f.name + " to gather "
                + f.nectar
                + " amount of nectar so that she is now loaded "
                + this.load + "/" + this.capacity
        );
        f.nectar = 0;
        return load >= capacity;
    }
}
