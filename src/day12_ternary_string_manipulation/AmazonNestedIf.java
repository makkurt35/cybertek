package day12_ternary_string_manipulation;

public class AmazonNestedIf {
    public static void main(String[] args) {
        boolean isPrimeMember = false;
        double totalOrderPrice = 29.45;

        if(isPrimeMember){
            System.out.println("Eligible for free shipping");
        }else {
            if(totalOrderPrice >= 25.0){
                System.out.println("Eligible for free shipping");
            }else{
                System.out.println("Not Eligible for free shipping");
            }
        }


    }
}
