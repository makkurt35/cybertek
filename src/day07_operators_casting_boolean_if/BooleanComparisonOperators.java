package day07_operators_casting_boolean_if;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10 > 5);
        System.out.println(10 > 11);

        System.out.println(88 >= 77);
        System.out.println(99 >= 99);
        System.out.println(100 >= 119);

        System.out.println(5 < 7);
        System.out.println(15 < 7);

        System.out.println(10 <= 15);//true
        System.out.println(10 <= 10);//true
        System.out.println(10 <= 1); //false

        System.out.println(100 == 100);//true
        System.out.println(100 == 1000);//false

        System.out.println(5 != 4);  //true
        System.out.println(10 != 10);//false
        //================================

        int num1 = 100;
        int num2 = 200;
                         //100    200
        System.out.println(num1 > num2);//false
        System.out.println(num1 < num2);//true

        System.out.println(num1 == num2);//false
        System.out.println(num1 != num2);//true

        //=======================

        boolean b1 = 123 > 100;
        System.out.println("b1 : " + b1);

        int currentSpeed = 60;
        int speedLimit = 55;
        boolean overLimit = currentSpeed > speedLimit;
        boolean overLimit2 = speedLimit < currentSpeed;

        System.out.println("overLimit: " + overLimit);
        System.out.println("overLimit2: " + overLimit2);

        currentSpeed = 55;
        boolean underOrAtLimit = currentSpeed <= speedLimit;

        System.out.println("under or at limit: " + underOrAtLimit);

        boolean atExactLimit = currentSpeed == speedLimit;
        System.out.println("At exact limit: " + atExactLimit);

        double balance = 150.0;
        boolean broke = balance <= 0.0;

        System.out.println("Am I broke? - " + broke);

        double bagPrice = 220.0;
        //check if you can afford bag
        broke = balance <= bagPrice;
        broke = (balance - bagPrice) <= 0.0;

        System.out.println("Am i broke? - " + broke);

        char letter1 = 'A'; //65
        char letter2 = 'B'; //66
        System.out.println(letter1 > letter2);//false
        System.out.println(letter1 < letter2);//true
        System.out.println(letter1 != letter2);//true

        System.out.println("wooden spoon" == "wooden spoon");
        String str = "java";
        System.out.println(str == "java");//true
        System.out.println(str != "java");//false






    }
}
