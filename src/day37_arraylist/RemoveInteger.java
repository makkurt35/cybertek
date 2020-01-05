package day37_arraylist;
import java.util.ArrayList;
public class RemoveInteger {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(2);
        nums.add(9);
        nums.add(3);
        nums.add(10);
        nums.add(11);
        nums.add(7);
        nums.add(7);

        System.out.println("Numbers count: " + nums.size());
        System.out.println(nums);
        //remove number from index 0.
        nums.remove(0);
        System.out.println(nums);

        //remove value - 2. and print again
        nums.remove( Integer.valueOf(2) );
        nums.remove( new Integer(7) );
        //create a Integer wrapper object with value 11
        Integer n = Integer.valueOf(11);//create wrapper object
        nums.remove(n);
        System.out.println(nums);

    }
}
