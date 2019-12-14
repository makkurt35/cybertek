package day26_arrays05;

public class CarsArray {
    public static void main(String[] args) {
        String[] myCars = {"Ford", "Chevy",
                           "Toyota", "Honda", "Mazda",
                           "Kia", "Hyundai",
                           "Bmw", "Audi", "Mercedes",
                           "Fiat", "Ferrari", "Alfa Romeo",
                           "Bugatti", "Renault"};

//
//        if (myCars[0].equals("Ford") || myCars[0].equals("Chevy")  ){
//            System.out.println(myCars[0] + " is American Car");
//        }
        System.out.println("Total cars: " + myCars.length);
        for (int i = 0; i < myCars.length; i++) {
           // System.out.println(myCars[i]);
            if(myCars[i].equals("Ford") || myCars[i].equals("Chevy")){
                System.out.println(myCars[i] +" is American car");
            }else if(myCars[i].equals("Toyota") || myCars[i].equals("Honda") || myCars[i].equals("Mazda")){
                System.out.println(myCars[i] +" is Japanese car");
            }else if(myCars[i].equals("Kia") || myCars[i].equals("Hyundai")){
                System.out.println(myCars[i] + " is Korean car");
            }else if(myCars[i].equals("Bmw") || myCars[i].equals("Audi") || myCars[i].equals("Mercedes")){
                System.out.println(myCars[i] + " is German car");
            }else if(myCars[i].equals("Fiat") || myCars[i].equals("Ferrari") || myCars[i].equals("Alfa Romeo")){
                System.out.println(myCars[i] + " is Italian car");
            }else if(myCars[i].equals("Bugatti") || myCars[i].equals("Renault") ){
                System.out.println(myCars[i] + " is French car");
            }else{
                System.out.println("Unknown Car. Be careful");
            }
        }




    }
}
