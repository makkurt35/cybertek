package day59_exceptions_collection1;
/*

RULE: If a method throws a checked exception, then caller is responsible to
Handle it or again declare it.
 */
public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {
        sleep(1);
        myMethod();
    }

    public static void sleep(int seconds) throws InterruptedException {
        System.out.println("sleeping for " + seconds + " seconds");
        Thread.sleep(seconds * 1000);
    }

    public static void myMethod() throws NullPointerException{
        System.out.println("myMethod, I might throw NullPointer Exception");
    }

}
