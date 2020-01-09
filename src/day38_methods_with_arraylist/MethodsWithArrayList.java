package day38_methods_with_arraylist;

import java.util.*;

public class MethodsWithArrayList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5); nums.add(15); nums.add(52); nums.add(25); nums.add(55);
        nums.add(53); nums.add(5); nums.add(501); nums.add(57); nums.add(85);

        printList(nums);

        List<Integer> nums2 = new ArrayList<>();
        nums2.add(4); nums2.add(10); nums2.add(6);
        System.out.println("Before doubling: " + nums2.toString());

        doubleTheList(nums2);

        System.out.println("After doubling: " + nums2.toString());

        System.out.println("Nums before doubling: " + nums.toString());
        doubleTheList(nums);
        System.out.println("Nums after  doubling: " + nums.toString());

        System.out.println("Nums2 Sum : " + sumList(nums2));
        System.out.println("Nums Sum : " + sumList(nums));
    }


    /*
    Method: sumList
    Param: List<Integer> nums
    Return: int
    Sums each number and returns
     */
    public static int sumList(List<Integer> nums){
        int sum = 0;
        for(int eachNum : nums){
            sum += eachNum;
        }
        return sum;
    }

    /*
    Method: doubleTheList
    Param:  List<Integer> nums
    Return: void
    it updates each number in nums by doubling it.
    nums -> 4,2,6
    doubleTheList(nums); 8, 4, 12
    print nums -> 8, 4, 12
    --> for loop, get number from index, multiply by 2
    and set result into same index
    int temp = nums.get(i);
    nums.set(i, temp * 2);
     */
    public static void doubleTheList(List<Integer> nums){
        for (int i = 0; i < nums.size(); i++) {
            int temp = nums.get(i);
            temp = temp * 2;
            nums.set(i, temp);
            //nums.set(i, nums.get(i) * 2); one line for above 3 lines
        }
    }




    /*
    Method: printList
    Params: List<Integer> list
    Return: void
    Print each value in same line separated by space
    listA = [4,2,3]
    printList(listA); => prints 4 2 3
     */
    public static void printList(List<Integer> list){
        for( Integer iEach : list){
            System.out.print(iEach +" ");
        }
        System.out.println();//goto new line
    }

}

