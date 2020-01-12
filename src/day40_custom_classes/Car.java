package day40_custom_classes;

public class Car {
    //model, price, color, year
    String model;
    double price;
    String color;
    int year;
    //acura.setCarInfo("Acura NSX", 44332, "Blue", 2018);
    public void setCarInfo(String newModel, double newPrice,
                           String newColor, int newYear){
        //assign param variables to object variables
        model = newModel;
        price = newPrice;
        color = newColor;
        year = newYear;
    }

    public void getCarInfo(){
        System.out.println("Car: "+ model +", " + price +", "+
                            color+", "+year);
    }

    public void drive(){
        System.out.println(model + " is driving...");
    }

    public void showPrice(){
        System.out.println(model + " price is $"+price );
    }

}
