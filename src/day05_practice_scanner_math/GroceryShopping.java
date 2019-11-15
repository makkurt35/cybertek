package day05_practice_scanner_math;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Harris Teeter!");
        System.out.println("How much are potatoes?");

        double price1 = input.nextDouble();
        System.out.println("How much are tomatoes?");
        double price2 = input.nextDouble();

        System.out.println("How much are eggplants?");
        double price3 = input.nextDouble();

        double totalPrice = price1 + price2 + price3;
        System.out.println("Total is $" + totalPrice);
    }
}
