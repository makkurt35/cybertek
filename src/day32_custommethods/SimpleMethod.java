package day32_custommethods;

public class SimpleMethod {

    public static void main(String[] args) {
        System.out.println("Hello from main method");
        displayMessage();//call/use the custom method
        displayMessage();
        System.out.println("Back in main method");
    }

    public static void displayMessage(){
        System.out.println("Hello World from my method!");
    }
}
