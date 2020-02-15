package day58_exceptions3;

public class TryWithFinally {
    public static void main(String[] args) {
        //Don't try use it in real coding, where they pay you
        try{
            System.out.println("In Try Block...");
            System.out.println(9/0);
        }finally {
            System.out.println("In Finally block . runs always");
        }

        System.out.println("After try finally...");
    }
}
