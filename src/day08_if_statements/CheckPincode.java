package day08_if_statements;

public class CheckPincode {
    public static void main(String[] args) {
        System.out.println("Welcome to Wells Fargo ATM!");

        int secretPincode = 2345;
        int inputPincode = 2341;

        if(inputPincode == secretPincode){
            System.out.println("Welcome to your Account!");
            System.out.println("You can withdraw, deposit, view balances");
        } else {
            System.out.println("Invalid pincode!");
            System.out.println("Access denied!");
        }
        //this is after if else statement, and will always run
        System.out.println("Thank you for your business! Bye");
    }
}
