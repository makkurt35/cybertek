package day58_exceptions3;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class TryCatch {
    public static void main(String[] args) {
        //Unhandled exception: java.io.FileNotFoundException
        try {
            FileReader fr = new FileReader("file.csv");
        }catch(FileNotFoundException e){
            System.out.println("FileNotFoundException is caught/Handled!");
            //e.printStackTrace();
        }

        System.out.println("AFTER TRY CATCH...");

        try {
            int[] nums = {23, 12, 54};
            System.out.println(nums[0]);
            System.out.println(nums[2]);
            //if (nums.length > 3) {
            System.out.println(nums[3]);
            //}
        }catch(NullPointerException e){
            System.out.println("ArrayIndexOutOfBoundsException is caught and handled...");
        }

        System.out.println("AFTER ARRAY");

    }
}
