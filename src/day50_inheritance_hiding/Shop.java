package day50_inheritance_hiding;

import java.util.*;

public class Shop {
    String name;
    List<Product> products = new ArrayList<>();
    public String toString(){
        return "name = " +  name+ ", products = " + products;
    }
}

class ShopObjects{
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.name = "CVS";
        shop.products.add(new Product("Vitamin", 5.99));
        shop.products.add(new Product("water",2.99));
        shop.products.add(new Product("Advil", 10.55));

        System.out.println(shop.toString());
    }
}
