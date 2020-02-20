package day61_collections3;
import java.util.*;

public class CitiesHashSet {
    public static void main(String[] args) {
        Set<City> citySet = new HashSet<>();

        City c1 = new City("Calamba");
        City c2 = new City("Calamba");
        City c3 = new City("Urumqi");
        City c4 = new City("Qashgar");

        citySet.add(c1);
        citySet.add(c2);
        citySet.add(c3);
        citySet.add(c4);

        System.out.println(citySet.size());
        System.out.println(citySet.toString());
        
        List<Integer> numsList = new ArrayList<>();
        numsList.add(10);
        numsList.add(10);
        numsList.add(100);
        numsList.add(100);
        numsList.add(100);
        
        Set<Integer> numsSet = new HashSet<>(numsList);

        System.out.println("numsList = " + numsList);
        System.out.println("numsSet = " + numsSet);
        
    }
}
