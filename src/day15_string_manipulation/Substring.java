package day15_string_manipulation;

public class Substring {
    public static void main(String[] args) {
        String word = "java is fun";
        //print java
        System.out.println( word.substring(0,4) );
        //print is
        System.out.println(word.substring(5,7));
        //print fun
        System.out.println(word.substring(8,11));

        System.out.println(word.substring(8));//start at 8 until end
    }
}
