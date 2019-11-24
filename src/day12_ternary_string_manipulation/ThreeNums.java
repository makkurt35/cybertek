package day12_ternary_string_manipulation;

public class ThreeNums {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 1000;
        int num3 = 1000;

        if(num1 >= num2 && num1 >= num3) {
            System.out.println(num1+" is largest");
        }else if (num2 >= num1 && num2 >= num3){
            System.out.println(num2 + " is largest");
        }else {
            System.out.println(num3 + " is largest");
        }
    }
}
