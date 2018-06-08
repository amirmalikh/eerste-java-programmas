package be.vdab.beehive;

public class Nurse extends Bee{
    int energy;
    int patience;



    public void nurseLarva(Larva larfje){
        this.energy--;
        this.patience-= 10;
        larfje.size += 2;


    }
}
