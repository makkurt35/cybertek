package day17_while_do_while_loop;
import java.util.*;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random random = new Random();//will help to generate random numbers
        int secretNumber = random.nextInt(10);

        int guessingNumber = 0;

        do{
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();
            if(guessingNumber > secretNumber){
                System.out.println("Wrong, your number is too large");
            }else if(guessingNumber <  secretNumber){
                System.out.println("Wrong, your number is too small");
            }
        }while(guessingNumber != secretNumber);

        System.out.println("Congratulations, you won!");


    }
}
