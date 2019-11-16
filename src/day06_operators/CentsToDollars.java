package day06_operators;

public class CentsToDollars {
    public static void main(String[] args) {
        int cents = 250;
        int dollars = cents / 100; //calculate dollars
        int remainingCents = cents % 100;//calculate remaining cents

        //2 dollars and 20 cents
        System.out.println(dollars + " dollars and "+remainingCents+" cents");




    }
}
