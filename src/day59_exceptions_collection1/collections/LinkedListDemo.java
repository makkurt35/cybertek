package day59_exceptions_collection1.collections;
import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        List<String> linkedList2 = new LinkedList<>();

        linkedList.add("java");
        linkedList.add("python");
        linkedList.add("c#");
        linkedList.add("C++");
        linkedList.addFirst("html");
        linkedList.addLast("javascript");

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.getFirst());

        System.out.println(linkedList.getLast());

        System.out.println(linkedList.toString());
        
        for(String each : linkedList){
            System.out.println("each = " + each);
        }

    }
}
