package day60_collections2;
import java.util.*;

public class SortingAList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java"); list.add("js");list.add("html");
        list.add("ruby");list.add("python"); list.add("kotlin");
        list.add("A++");
        System.out.println("--BEFORE SORTING--");
        System.out.println(list.toString());

        Collections.sort(list);
        System.out.println("--AFTER SORTING--");

        System.out.println(list.toString());

        List<Product> prodList = new ArrayList<>();
        prodList.add(new Product("wooden spoon", 12.99));
        prodList.add(new Product("computer bag", 105.99));
        prodList.add(new Product("shoes", 54.99));
        prodList.add(new Product("bmw 525i", 2700.99));
        prodList.add(new Product("macbook pro", 1499.99));

        System.out.println("--PROD LIST BEFORE SORTING--");
        System.out.println(prodList.toString());

        Collections.sort(prodList);

        System.out.println("--PROD LIST AFTER SORTING--");
        System.out.println(prodList.toString());

        Product p1 = new Product("wooden spoon", 1499.99);
        Product p2 = new Product("macbook pro", 499.99);

        System.out.println(p1.compareTo(p2));






    }
}
