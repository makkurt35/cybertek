package day58_exceptions3;

public class ORCatchBlock {
    public static void main(String[] args) {
        String str = "abc";

        try{
            System.out.println("In try block...");
            System.out.println(str.charAt(0));
            String str2 =null;
            System.out.println(str2.toUpperCase());
        }catch(StringIndexOutOfBoundsException | NullPointerException   e){
            System.out.println("Exception is caught");
            System.out.println("Message: " + e.getMessage());
            System.out.println("Exception class: " + e.getClass().getSimpleName());
        }catch(RuntimeException e){
            System.out.println("RuntimeException caught!");
            System.out.println("Message: " + e.getMessage());
            System.out.println("Exception class: " + e.getClass().getSimpleName());
        }
    }
}
