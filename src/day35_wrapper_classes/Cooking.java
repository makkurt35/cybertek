package day35_wrapper_classes;
import java.util.*;

public class Cooking {

    public static void main(String[] args) {
        scrambledEggsRecipe();
        pastaRecipe();
    }

    public static void pastaRecipe(){
        System.out.println("~~~ DELICIOUS PASTA RECIPE ~~~");
        add("water");
        boil(1);
        add("salt", "spagetti","olive oil");
        boil(10);
        System.out.println("Pick up wooden spoon");
        mix(100);
        System.out.println("~~~ READY - DRAIN WATER AND ENJOY THEN CODE JAVA ~~~");
    }

    public static void scrambledEggsRecipe(){
        System.out.println("~~~ SCRAMBLED EGGS RECIPE ~~~");
        add("oil", "eggs", "salt", "cheese");
        mix(10);
        fry(3);
        System.out.println("~~~ READY! ENJOY YOUR SCRAMBLED EGGS ~~~");
    }

    /*
    Create a class Cooking
    void add (String... items){
        System.out.println("Add- "+Arrays.toString(items));
    }
    void mix (int seconds)
    void boil(int minutes)
    void fry (int minutes)
    void bake(int minutes)
     */
    public static void add (String... items){
        System.out.println("Add - "+Arrays.toString(items));
    }

    public static void mix(int seconds) {
        System.out.println("Mix for "+ seconds + " seconds");
    }

    public static void boil(int minutes){
        System.out.println("Boil for "+minutes+" minutes");
    }

    public static void fry(int minutes){
        System.out.println("Fry for "+minutes+" minutes");
    }

    public static void bake(int minutes){
        System.out.println("Bake for "+minutes+" minutes");
    }

}
