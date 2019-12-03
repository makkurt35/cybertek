package day18_for_loop;

public class SumOfNumbers {
    public static void main(String[] args) {
        /*
        Sum of all numbers between 1 to 5
        1+2+3+4+5 => 15
        sum is 15
         */
        int sum = 0;
        for(int num = 1;num <= 5; num++){
            sum += num;//sum = sum + num;
        }

        System.out.println("sum = " + sum);
    }
}
