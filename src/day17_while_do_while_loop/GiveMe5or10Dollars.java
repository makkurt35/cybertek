package day17_while_do_while_loop;
import java.util.*;
public class GiveMe5or10Dollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dollars = 0;

        while(dollars != 5 && dollars != 10){
            System.out.println("Give me 5 or 10 dollars");
            dollars = scan.nextInt();
        }

        System.out.println("Thank you for $"+dollars);

    }
}
