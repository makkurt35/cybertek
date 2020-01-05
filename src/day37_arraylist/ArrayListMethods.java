package day37_arraylist;
import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Mclean");
        cities.add("Alexandria");
        cities.add("Baltimore");
        cities.add("Baku");
        cities.add("Kabul");
        cities.add("Tashkent");
        cities.add("Tehran");
        cities.add("Asmara");
        cities.add(0, "Calamba"); //add Calamba to index 0
        cities.add(1, "Reston"); //add Reston to index 1

        System.out.println(cities);

        cities.add(2, "Yerevan");

        System.out.println(cities);
        //change/replace index 4 value to New York
        cities.set(4, "New York");
        cities.set(5, "Samarkand");

        System.out.println(cities.toString());

        //remove element|value at index 3
        cities.remove(3);
        System.out.println(cities.toString());
        //remove New York
        cities.remove("New York");
        System.out.println(cities);

        cities.remove(3);
        cities.remove("Tashkent");

        System.out.println(cities);

        System.out.println("Cities count: " + cities.size());

    }
}
