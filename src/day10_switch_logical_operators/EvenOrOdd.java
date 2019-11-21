package day10_switch_logical_operators;

public class EvenOrOdd {
    public static void main(String[] args) {
        int number = 35;
        //check if number is divisible by 2 and no remainder
        if(number % 2 == 0){
            System.out.println(number + " is Even");
        }else{
            System.out.println(number + " is Odd");
        }
    }
}
