package be.vdab;

public class FizzBuzz {
    public static void main(String[] args) {

   /*     veelvoud 3 = fizz;
        veelvoud 5 = buzz;
        veelvoud 3 + 5 = fizzbuzz
  */


        int fizz = 3;
        int buzz = 5;

        for (int i = 0; i <= 100; i++) {
            if (i % fizz == 0 && i % buzz == 00)
                System.out.println("FizzBuzz");
            else if (i % fizz == 0)
                System.out.println("Fizz");
            else if (i % buzz == 0)
                System.out.println("Buzz");

            else {
                System.out.println(i);
            }
        }


    }
}