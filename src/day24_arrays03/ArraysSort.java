package day24_arrays03;
import java.util.*;
public class ArraysSort {
    public static void main(String[] args) {
        int[] nums = {44, 12, 5, 900, 1, -5};
        System.out.println("before sorting");
        System.out.println( Arrays.toString(nums) );

        Arrays.sort(nums); // sorting nums array values

        System.out.println("after sorting");
        System.out.println(Arrays.toString(nums));

        //declare companies array and assign 4 companies
        String[] companies = {"Cybertek", "Capital one", "FreddieMac","apple", "Google", "Verizon"};
        //sort companies array
        Arrays.sort(companies);

        System.out.println(Arrays.toString(companies));
        System.out.println(companies[0]);

        String[] words = {"apples", "bananas", "cherries"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
    }
}
