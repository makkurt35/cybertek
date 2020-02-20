package day61_collections3;
import java.util.*;
import day60_collections2.Product;

public class HashSetOfProducts {
    public static void main(String[] args) {
        Set<Product> prodSet = new HashSet<>();
        prodSet.add(new Product("book", 25));
        prodSet.add(new Product("book", 25));
        prodSet.add(new Product("magazine", 17));

        System.out.println(prodSet.size());
        System.out.println(prodSet.toString());

    }
}
