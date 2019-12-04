package day19_forloop_2;

public class LoopFizzBuzz {
    public static void main(String[] args) {
        //for loop from 0 to 100
        for(int num = 0; num <= 100; num++){
            if(num % 3 == 0 && num % 5 == 0){
                System.out.println(num + " is FizzBuzz number");
            }else if (num % 3 == 0){
                System.out.println(num + " is Fizz number");
            }else if (num % 5 == 0){
                System.out.println(num + " is Buzz number");
            }
        }
    }
}

//BREAK TILL 7:46 PM
