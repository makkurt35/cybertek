package day35_wrapper_classes;

public class ApartmentLease {

    public static void main(String... hello) {
        applyForApartment(750);
        applyForApartment(450);
    }

    public static void applyForApartment(int creditScore){
        if (creditScore >= 650 && creditScore <= 850){
            qualify();
        }else {
            notQualify();
        }
    }

    static public void qualify(){
        System.out.println("Congratulations, your application for apartment is approved!");
    }

    public static void notQualify(){
        System.out.println("Unfortunately, your application for apartment is denied! Bye,Code More Java!");
    }



}
