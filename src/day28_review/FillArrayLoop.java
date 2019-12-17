package day28_review;
import java.util.*;
public class FillArrayLoop {
    public static void main(String[] args) {
        int[] nums = new int[101];//declare int array with size 101
        System.out.println(nums[0]);//0- by default all 0s
        //nums[0] = 200;
        //0-100
        for(int i = 0; i <= 100; i++){
            //System.out.println(i);
            nums[i] = i;
        }
        //0 -> 0, 1 -> 1, 2 -> 2, 3 -> 3 etc
        System.out.println(Arrays.toString(nums));

        //PRINT same array in reverse in same line
        //          100             0
        System.out.println("length: " + nums.length);
        System.out.print("[");
        for(int i = nums.length-1; i >= 0; i-- ){
            System.out.print(nums[i]+", ");
        }
        System.out.println("]");

    }
}
