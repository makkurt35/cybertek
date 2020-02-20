package day61_collections3;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        //   Key  , Value
        Map<String, Double> items = new HashMap<>();
        items.put("eggs", 4.45);
        items.put("strawberries", 7.99);
        items.put("potatoes", 7.99);
        items.put("CAT food", 18.0);
        items.put("milk", 3.99);
        items.put("cookies", 3.49);
        items.put("cookies", 3.0);//will take this price

        System.out.println(items.toString());
        System.out.println("size : " + items.size());

        System.out.println("Price of eggs: " + items.get("eggs"));
        System.out.println(items.get("strawberries"));
        System.out.println(items.get("potatoes"));
        System.out.println(items.get("CAT food"));
        System.out.println(items.get("milk"));
        System.out.println(items.get("cookies"));

        System.out.println( items.keySet() );//all keys in Set format
        System.out.println( items.values() );//all values in Collection Format

        for(String key : items.keySet()){
            System.out.print("key="+key);
            System.out.println(", value="+items.get(key));
        }

        System.out.println(items.containsKey("eggs"));

    }
}
