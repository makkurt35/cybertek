package day24_arrays03;

public class CopyArray {
    public static void main(String[] args) {
                     //0   1   2    3   4  5    6
        int[] nums1 = {23, 55, 34, 87, 90, 123, 30};
       // int[] nums5 = nums1; both point to same object in heap
        //declare nums2 with same size as nums1
        int[] nums2 = new int[nums1.length];
        System.out.println("nums1 length: " + nums1.length);
        System.out.println("nums2 length: " + nums2.length);

        //using for loop, read all values from nums1 and assign to nums2
        for (int idx = 0; idx < nums1.length; idx++){
            nums2[idx] = nums1[idx];
            //System.out.println( nums2[idx]+"-"+nums1[idx]);
        }

        //print values from nums1 and nums2 using for each loop
        for(int num : nums1 ) {
            System.out.print(num +" ");
        }
        System.out.println();
        for(int num : nums2 ) {
            System.out.print(num +" ");
        }

        //Declare nums3 with same size as nums1 and assign all values in doubles
        int[] nums3 = new int[nums1.length];

        //assign all values in doubles into nums3
        for(int i = 0; i < nums1.length; i++){
            nums3[i] = nums1[i] * 2;
        }

        System.out.println();
        for(int n : nums3) {
            System.out.print(n +" ");
        }

    }
}
