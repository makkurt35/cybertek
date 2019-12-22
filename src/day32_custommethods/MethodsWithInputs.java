package day32_custommethods;

public class MethodsWithInputs {

    public static void main(String[] args) {
        displayMessage("Java is fun!");
        displayMessage("Coding Java today");
        greetByName("Murodil");
        greetByName("Shenouda");
        String someName = "Omer Faruk";
        greetByName(someName);
        count(5);
        count(100);
    }

    public static void displayMessage(String message){
        System.out.println("message: " + message);
    }

    /*
    Method: greetByName
    Input: String name
    "Hello, Alan, how are you?"
     */
    public static void greetByName(String name){
        System.out.println("Hello, "+name+", how are you?");
    }

    /*
    Method: count
    Input/param: int num
    method will print all numbers
    0 - num in same line separated by space
    ex: count(5); 0 1 2 3 4 5
     */
    public static void count(int num){
        for(int z = 0; z <= num; z++){
            System.out.print(z +" ");
        }
        System.out.println();
    }


}
