package day51_abstraction;

public class ElectricCarObjects {
    public static void main(String[] args) {
        //ElectricCar ec = new ElectricCar(); //ERROR, cannot be instantiated
        Tesla modelS = new Tesla();
        modelS.model = "Model S";
        modelS.price = 43000;
        modelS.color = "Grey";
        modelS.charge();
        modelS.start();
        modelS.drive();
        modelS.stop();

        Ford fusion = new Ford();
        fusion.charge();
        fusion.start();
        fusion.drive();
        fusion.stop();

        //ElectricTruck et = new ElectricTruck() ; ERROR
        TeslaSemi semi = new TeslaSemi();
        semi.charge();
        semi.start();
        semi.load("potatoes");
        semi.drive();
        semi.stop();

        TeslaTruck teslaTruck = new TeslaTruck();
        teslaTruck.model = "CyberTruck";
        teslaTruck.color = "White";
        teslaTruck.price = 150000;
        teslaTruck.charge();
        teslaTruck.start();
        teslaTruck.load("tomatoes");
        teslaTruck.drive();
        teslaTruck.stop();

        System.out.println(modelS.toString());
        System.out.println(fusion.toString());
        System.out.println(teslaTruck.toString());

    }
}
