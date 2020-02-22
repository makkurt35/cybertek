package day62_collections4;

import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {
        //declare raw hashmap
        Map rawMap = new HashMap();
        rawMap.put(1234, 4567);
        rawMap.put(true, false);
        rawMap.put("key", "value");
        rawMap.put("potatoes", 7.0);
        System.out.println(rawMap);

        //declare polymorhic Map<Integer,String >
        Map<Integer, String> employees = new HashMap<>();

        HashMap<Integer, List<String>> empMap = new HashMap<>();

        List<Map<Integer, String>> list = new ArrayList<>();

        employees.put(10, "Wali");
        employees.put(20, "Nijat");
        employees.put(30, "Yassine");
        employees.put(40, "Amir");//OUT
        employees.put(50, "Luba");
        employees.put(60, "May");
        employees.put(70, "Imad");
        employees.put(80, "Nassif");

        System.out.println(employees.toString());

        System.out.println(80+ "-"+ employees.get(80));//Nassif
        int id = 20;
        System.out.println(id +"-"+ employees.get(id));

        System.out.println(employees.get(100));//null

        //Amir - OUT, Tahmina for id 40
        employees.replace(40, "Tahmina");
        id = 40;
        System.out.println(id +"-"+ employees.get(id)); //Tahmina
        //Tahmina - OUT, replace value with Imtiaz
        employees.put(40, "Imtiaz");
        System.out.println(id +"-"+ employees.get(id));

        System.out.println("--size() method--");
        System.out.println(employees.size());

        System.out.println("--remove(key) method--");
        employees.remove(10);

        System.out.println(employees.toString());

        System.out.println("--containsKey(key) method--");
        System.out.println(employees.containsKey(70));
        System.out.println(employees.containsKey(10));

        System.out.println("--containsValue(value) method--");
        System.out.println(employees.containsValue("Nijat"));
        System.out.println(employees.containsValue("Nadir"));

        System.out.println("--isEmpty() method--");
        System.out.println(employees.isEmpty());
        System.out.println(empMap.isEmpty());

        System.out.println("--keySet() method--");
        System.out.println("keys:" + employees.keySet());
        Set<Integer> empIDs = employees.keySet();
        System.out.println("empIDs = " + empIDs);

        System.out.println("--values() method--");
        System.out.println(employees.values());

        Collection<String> empNames = employees.values();
        System.out.println("empNames = " + empNames);


    }
}
