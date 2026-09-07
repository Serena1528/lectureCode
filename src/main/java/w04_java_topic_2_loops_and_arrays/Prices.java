package w04_java_topic_2_loops_and_arrays;
import static input.InputUtils.doubleInput;
import static input.InputUtils.stringInput;
import static input.InputUtils.intInput;

public class Prices {
    public static void main(String[] args) {
        String productName = stringInput("What is the name of the product?");
        double price = doubleInput("What does " + productName + " cost?");
        int quantity = intInput("How many " + productName + " to sell?");

        double totalPrice = price * quantity;

        System.out.println(quantity + " of " + productName + " at $ " + price + " each costs $" + totalPrice);
        System.out.printf("%d of %s at %.2f each costs $%.2f", quantity, price, price, totalPrice);
    }
}
