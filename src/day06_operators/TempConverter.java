package day06_operators;
import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Fahrenheit value:");
        double fahrenheit = input.nextDouble();
        //C = (F − 32) × 5/9
        double celsius = (fahrenheit - 32) * 5/9;
        //58 is 7.2222 in Celsius
        System.out.println(fahrenheit + " is " + celsius + " in Celsius" );

        System.out.println("######### C TO F CONVERTER ##########");
        //F = (C × 9/5) + 32
        System.out.println("Enter Celsius value:");
        celsius = input.nextDouble();
        fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " is " + fahrenheit + " in fahrenheit");







    }
}
