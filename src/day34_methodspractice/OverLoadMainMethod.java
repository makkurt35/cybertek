package day34_methodspractice;

public class OverLoadMainMethod {
    public static void main(String[] args) {
        System.out.println("hello World!");
        main(10);

    }
    /*
    overloading a main method
    - same name
    - different parameter
    But this new main method, is not what jdk(java) looks for when
    starting code execution
     */
    public static void main(int num) {
        System.out.println("num: " + num);
    }
}
