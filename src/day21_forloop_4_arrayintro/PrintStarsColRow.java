package day21_forloop_4_arrayintro;
import java.util.*;
public class PrintStarsColRow {
    public static void main(String[] args) throws Exception{
        Random rnd = new Random();
        int rows = rnd.nextInt(11)+1;
        int columns = rnd.nextInt(25)+1;

        for(int r = 1; r <= rows; r++){
            for(int col = 1; col <= columns; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Thread.sleep(678); Pause for 678 milliseconds
        //main(null); repeat main method



    }
}
