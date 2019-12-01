package day17_while_do_while_loop;

public class CountWhileLoop {
    public static void main(String[] args) throws Exception {
        int counter = 1;
        while(counter <= 10){
            System.out.print(counter + " ");
            ++counter;
            Thread.sleep(500);//pause
        }
        System.out.println(); //goto new line
        //10 9 8 7 6 5 4 3 2 1
        int counter2 = 10;
        while(counter2 >= 1){
            System.out.print(counter2 +" ");
            counter2--;
        }

    }
}
