public class Random {
    public static void main(String[] args) {

        int min = 10;
        int max = 100;

        System.out.println((int)(Math.random() * ((max - min) + 1)) + min);


    }
}
