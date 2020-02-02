package day51_abstraction;

public class ElectricCarObjects {
    public static void main(String[] args) {
        //ElectricCar ec = new ElectricCar(); ERROR, cannot be instantiated
        Tesla modelS = new Tesla();
        modelS.charge();
        modelS.start();
        modelS.drive();
        modelS.stop();

        Ford fusion = new Ford();
        fusion.charge();
        fusion.start();
        fusion.drive();
        fusion.stop();



    }
}
