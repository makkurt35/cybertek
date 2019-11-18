package day07_operators_casting_boolean_if;
import java.util.Scanner;
public class EmailBuilder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to your new Company!");
        System.out.println("Enter first name, last name, company name:");
        String firstName = scan.next();
        String lastName = scan.next();
        String companyName = scan.next();
        //john_smith@cybertek.com
        String email = firstName + "_" + lastName + "@" + companyName + ".com";
        System.out.println("Your email: " +  email );
    }
}
