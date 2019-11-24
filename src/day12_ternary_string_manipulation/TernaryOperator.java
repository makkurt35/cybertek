package day12_ternary_string_manipulation;

public class TernaryOperator {
    public static void main(String[] args) {
        int num1 = 55;
        int num2 = 100;
        
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("max = " + max);

        int score = 88;
        String result = (score >= 60) ? "pass" : "fail";
        System.out.println("result = " + result);

        if(score >= 60){
            result = "pass";
        }else{
            result = "fail";
        }
        System.out.println("result = " + result);
        
    }
}
