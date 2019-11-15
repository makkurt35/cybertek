package day05_practice_scanner_math;

public class AgeCalculator {
    public static void main(String[] args) {
        String name = "Adam Smith";
        int yearOfBirth = 1999;
        int currentYear = 2019;
        int age = currentYear - yearOfBirth;
        System.out.println(age);
        //Adam Smith is 20 years old
        System.out.println(name +" is "+ age + " years old" );

    }
}
