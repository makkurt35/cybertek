package day30_review;

public class CarInfo {
    public static void main(String[] args) {

        //MINI-Cooper -> MINI-******
        //Infiniti-QX56 -> Infiniti-****
        /*
        Split or use substring, and get make and model
        Count number of chars in model and using a loop
        build that many stars
         */
        String car = "Infiniti-QX56";
        //1. using split
        String[] carArray = car.split("-");
        String make = carArray[0];
        String model = carArray[1];
        /*
        2. Using substring, indexOf
        String make = car.substring(0, car.indexOf("-");
        String model = car.substring( car.indexOf("-")+1 );
         */

        String stars = "";
                            //6
        for (int i = 1; i <= model.length(); i++) {
            stars += "*";
            //System.out.println(stars);
        }

        String carModelMasked = make+"-"+stars;
        System.out.println(carModelMasked);
    }
}
