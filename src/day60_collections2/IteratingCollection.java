package day60_collections2;
import java.util.*;

public class IteratingCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java"); list.add("js");list.add("html");
        list.add("ruby");list.add("python"); list.add("kotlin");

        for(String str : list){
            System.out.println(str);
            //list.remove(str); ConcurrentModificationException
            //list.remove(0);   ConcurrentModificationException
            //list.add("C#");   ConcurrentModificationException
        }

        //Iterator interface can be used to iterator
        //Declaring Iterator variable and assigning our list
        Iterator<String> it = list.iterator();

       // System.out.println(it.hasNext());//true
       // System.out.println(it.next()); //java
       // System.out.println(it.next()); //js
       // System.out.println(it.next()); //html
        while(it.hasNext()){
            System.out.println(it.next());//print current value and goto next
            it.remove(); //remove the current value
        }

        System.out.println(list.toString());//list is now empty

    }
}
