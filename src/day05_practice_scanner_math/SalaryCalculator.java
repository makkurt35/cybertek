package day05_practice_scanner_math;

public class SalaryCalculator {
  public static void main(String[] args) {
     double hourlyRate = 40.0;
     double weeklySalary = hourlyRate * 40;
     double monthlySalary = weeklySalary * 52 / 12;
     double annualSalary = monthlySalary * 12;

     System.out.println("Your weekly salary: $" + weeklySalary);
     System.out.println("Your monthly salary: $" + monthlySalary);
     System.out.println("Your annual salary: $" + annualSalary);
  }
}
