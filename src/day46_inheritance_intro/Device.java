package day46_inheritance_intro;

public class Device {
    public String brand;
    public double price;
    public String country;

    public void use(){
        System.out.println("using " + brand+ " that costs $" + price + " and was made in "+country);
    }

}
