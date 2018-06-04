package be.vdab.beehive;

public class Worker {
    int capacity ;
    int load ;

    public Worker() {
        this(0,100);
    }
    public Worker(int load) {
        this(load, 100);
    }
    public Worker()

    public Worker(int initialLoad,int initialCapacity) {
        //System.out.println("CONSTRUCTOR");
        capacity = initialCapacity;
        load = initialLoad;
    }

    public void gatherNectar() {
        for (int i = 0; i < 10 && capacity > load; i++) {
            System.out.println("Visit next flower " + load + "/" + capacity);
            // visit flower
            load += 5;

        }
    }
}
