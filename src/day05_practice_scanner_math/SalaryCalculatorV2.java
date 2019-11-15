package day05_practice_scanner_math;
import java.util.Scanner;
public class SalaryCalculatorV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter hourly rate");
        double hourlyRate = input.nextDouble();
        double weeklySalary = hourlyRate * 40;
        double monthlySalary = weeklySalary * 52 / 12;
        double annualSalary = monthlySalary * 12;

        System.out.println("Your Weekly salary: " + weeklySalary);
        System.out.println("Your monthly salary: " + monthlySalary);
        System.out.println("Your annual salary: " + annualSalary);
    }
}
