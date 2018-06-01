import java.util.Arrays;

public class ArraysOefeningLotto {
    public static void main(String[] args) {
   /* OEFENING 1  VOWELCOUNTER
   - vraag aan de gebruiker een input text
   - String -> conveer naar char[]
   - tel alle klinkers

   OEFENING 2 LOTTO GENERATOR
   1 ,,, 45 -> 6 random getallen genereren die uniek zijn
   sorteer van klein naar groot -> ArraysOefeningLotto.sort en/of ArraysOefeningLotto.binarysearch

   OEFENING 3 VECTORS    - array van 2 getallen
   - definieer een vector als een array van 2 dimmensies x en y
   - bepaal de lengte van de vector met de stelling van Pythagoras
   EXTRA: bepaal het 'dot product"

   OEFENING 4 MATRICES
   - bepaal twee matrixen adhv arrays (2d)
   - vermenigvuldig deze twee


    */

/*
        int[] random = new int[6];
        int min = 1;
        int max = 45;

        for (int i = 0; i < random.length; i++) {
            random[i] = ((int) (Math.random() * ((max - min) + 1) + min));
            Arrays.sort(random);

          //  System.out.println(random[i]);
            int unchecked = random[i];
            int checked = Arrays.binarySearch(random, unchecked);
           System.out.println(checked);


        }
        */


        int[] lotto = new int[6];


        for(int i=0; i <6; i++) {

            int kandidaat = 0;
            do {
                 kandidaat = genrateLottoNumber();
            } while(reedsAanwezig(lotto, kandidaat));
            lotto[i] = kandidaat;
        }

        for (int i : lotto) {
            System.out.println(i);
        }

    }

    public static boolean reedsAanwezig(int[] array, int test) {
        Arrays.sort(array);
        return Arrays.binarySearch(array, test) == -1;
    }


    public static int genrateLottoNumber() {
        int min = 1;
        int max = 45;
        return ((int) (Math.random() * ((max - min) + 1) + min));
    }
}