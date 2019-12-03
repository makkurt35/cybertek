package day18_for_loop;

public class ForLoopCount {
    public static void main(String[] args) {
        //print 1 - 10 using for loop
        for(int n = 1; n <= 10; n++){
            System.out.println(n);
        }
        //System.out.println(n); n is not visible outside for loop.

        //say Hello Friends! 3 times using for loop
        for (int j = 0;j <= 2;j++){
            System.out.println("Hello Friends!!!");
        }

        //infinite loop using for loop
//        for(;;){
//            System.out.println("Java is Fun!!!");
//           // break; exit loop . we will learn more later
//        }
    }
}
