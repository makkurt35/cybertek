package day58_exceptions3;

import java.net.*;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println("IN TRY BLOCK..");
            URL etsyURL = new URL("www.etsy.com");
            System.out.println("END OF TRY BLOCK...");
        }catch(MalformedURLException e){
            System.out.println("MalformedURLException is caught and handled...");
            //e.printStackTrace();
            System.out.println("Reason: " + e.getMessage());
        }finally {
            System.out.println("Finally Block - runs always");
        }

        System.out.println("AFTER TRY CATCH FINALLY...");

        try {
            System.out.println("In 2nd try block..");
            int num = Integer.parseInt("123abc");//converting string to int
            System.out.println("End of second try block...");
        }catch(IndexOutOfBoundsException e){
            System.out.println("NumberFormatException was caught and handled..");
            System.out.println("getMessage(): " + e.getMessage());
            System.out.println("getCause(): " + e.getCause());
        }finally {
            System.out.println("2nd Finally block. Runs All the time...");
        }

        System.out.println("AFTER 2ND TRY CATCH FINALLY...");


    }
}
