package day42_encapsulation;

import java.util.ArrayList;

public class NullValue {
    //instance variable
    String inStr; // inStr = null; <- by default
    int numberOfDays; //0
    ArrayList<Integer> myList; //null

    public static void main(String[] args) {
        //local variables
        int n;
       // n++;
        String localStr;//does not get any default value like null
        //System.out.println(localStr); //<-- ERROR. Not initialized
        //System.out.println(n);  //<-- ERROR. Not Initialized

        String myString = null;
        Integer num = null;
        System.out.println(num.toString());
        System.out.println(myString);//null
        System.out.println( myString.length());

    }
}
