package day04_math_operators_scanner;

public class Calculations {
    public static void main(String[] args) {
        double price1 = 15.5;
        double price2 = 55.1;
        double price3 = 10.0;

        double totalPrice = price1 + price2 + price3;
        System.out.println("Total price: " + totalPrice);

        double balance = 1200.0;
        double remainingBalance = balance - totalPrice;

        System.out.println("Remaining balance: " + remainingBalance);

        System.out.println(balance - totalPrice);

        //declare variable int linesOfCode and assign 25
        //declare variable int classCount and assign 6
        //Calculate how many lines of code written and print out

        int linesOfCode = 25;
        int classCount = 6;
        System.out.println(linesOfCode * classCount);
        System.out.println("Total lines of code: " + linesOfCode * classCount);

        int totalLinesOfCode = linesOfCode * classCount;
        System.out.println("Total Lines of Code: " + totalLinesOfCode);
    }
}
