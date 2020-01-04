package day36_wrapper_arraylist;
import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        //declare general arraylist
        ArrayList myFirstList = new ArrayList();
        //assign values using add method
        myFirstList.add("java");
        myFirstList.add("javascript");
        myFirstList.add("python");
        myFirstList.add("repl.it");
        myFirstList.add(1200);
        myFirstList.add(34.5);
        myFirstList.add(true);

        System.out.println(myFirstList);//print all values in single line

        //Declare ArrayList that can hold only Integers
        ArrayList<Integer> numsList = new ArrayList<>();
        numsList.add(100);
        numsList.add(200);
        numsList.add(300);
        //numsList.add("555");
        System.out.println(numsList.toString() );

    }
}
