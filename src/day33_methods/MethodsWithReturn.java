package day33_methods;

public class MethodsWithReturn {

    public static void main(String[] args) {
        System.out.println( getName() );
        String myName=getName();
        System.out.println("myName = " + myName);

        //call giveMe5Dollars method
        int wallet = giveMe5Dollars();
        System.out.println("How much in wallet? - $" + wallet);
                            //5
        System.out.println(giveMe5Dollars());

        String str = "java";
        System.out.println(str.length());//4

        int len = str.length();
        System.out.println(len);

        System.out.println( str.toUpperCase() );
        
        String upper = str.toUpperCase();
        System.out.println("upper = " + upper);

        System.out.println(giveMe5Dollars());
       // System.out.println(fiveDollars()); will not work, since it is void
       // int numm = fiveDollars();

    }

    public static void fiveDollars(){
        int dollars = 5;
    }

    public static int giveMe5Dollars(){
        int dollar = 5;
        return dollar;
    }

    public static String getName(){
        return "John";
    }

}
