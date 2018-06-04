package be.vdab;

public class CookieCallorieCounter {
    public static void main(String[] args) {
        short gegetenKoekjes = 2;
        float caloriesPerServing = 300;
        short servingsPerBag = 10;
        short cookiesPerBag = 40;
        int cookiesPerServing = cookiesPerBag / servingsPerBag;
        float caloriesPerCookie = caloriesPerServing / cookiesPerServing;
        float consumedCalories = caloriesPerCookie * gegetenKoekjes;


        System.out.println("het aantal caloriën bedraagt: " + consumedCalories);


    }


}
