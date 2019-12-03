package day18_for_loop;

public class PrintEvenOddNumbers {
    public static void main(String[] args) {
        //print all even numbers between 1 and 100
        for(int num = 0; num <= 100; num++){
            if(num % 2 == 0){
                System.out.print(num+" ");
            }
        }
        System.out.println();
        for(int num = 0; num <= 100; num++){
            if(num % 2 != 0){
                System.out.print(num+" ");
            }
        }
    }
}
