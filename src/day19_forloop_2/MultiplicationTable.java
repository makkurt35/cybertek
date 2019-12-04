package day19_forloop_2;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 9;

        if(number < 1 || number > 10){
            System.out.println("ERROR: Invalid input");
            //return;//stop here. end the main method
            System.exit(0);//Stop here. more powerful version
        }


        System.out.println("Multiplication table for " + number);
        for(int n = 1; n <= 10; n++){
            int result = n * number;
            //System.out.println("result = " + result);
            System.out.println(n +" x "+number+" = "+result);
        }


    }
}
