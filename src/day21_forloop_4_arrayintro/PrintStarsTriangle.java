package day21_forloop_4_arrayintro;

public class PrintStarsTriangle {
    public static void main(String[] args) {
        int columns = 5;

        for(int outer = 1; outer <= columns; outer++){
            for(int inner = 1;inner<= outer; inner++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
