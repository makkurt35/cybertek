package day28_review;
import java.util.*;
public class ArrayRandomNumbers {
    public static void main(String[] args) {
        //Create a Random object
        Random rd = new Random();
        //how to generate 0-100 number using Random
        System.out.println(rd.nextInt(101));//0-100
        System.out.println(rd.nextInt(101));

        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = rd.nextInt(101);
        }
        System.out.println(Arrays.toString(nums));
        //Sort it
        Arrays.sort(nums);
        //print again
        System.out.println(Arrays.toString(nums));
        //int[] nums2 = {33,44,10,23,54};
        while(true) {
            int[] nums2 = {rd.nextInt(101),
                    rd.nextInt(101),
                    rd.nextInt(101),
                    rd.nextInt(101),
                    rd.nextInt(101),
                    rd.nextInt(101),
                    rd.nextInt(101),
                    rd.nextInt(101),
                    rd.nextInt(101),
                    rd.nextInt(101)};
            System.out.println(Arrays.toString(nums2));
        }

    }
}
