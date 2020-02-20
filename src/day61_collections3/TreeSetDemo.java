package day61_collections3;
import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Double> treeSet = new TreeSet<>();
        SortedSet<Double> myTreeSet = new TreeSet<>();

        myTreeSet.add(555.0);
        myTreeSet.add(555.0);
        myTreeSet.add(0.0);
        myTreeSet.add(5.0);
        myTreeSet.add(15.0);

        System.out.println(myTreeSet.size());
        System.out.println(myTreeSet.toString());

    }
}
