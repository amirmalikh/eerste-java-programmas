public class ProductPriceCalculator {
    public static void main(String[] args) {

        int price = 35;
        int quantity = 5;
        int taxRate = 21;

        double tax = ((taxRate/100)+1);
        double subtotal = price * quantity;

        System.out.println(subtotal * 1.21);

    }
}
