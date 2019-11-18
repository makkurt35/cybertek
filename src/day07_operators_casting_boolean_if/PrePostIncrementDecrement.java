package day07_operators_casting_boolean_if;

public class PrePostIncrementDecrement {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = ++num1;//2
        System.out.println("Num1 : " + num1);
        System.out.println("Num2 : " + num2);

        int j1 = 4;
        int j2 = j1++;//4 -> assign to j2 , then increase j1
        /*
           int j2 = j1;
           j1++;
         */
        System.out.println("j1: " + j1);
        System.out.println("j2: " + j2);

    }
}
