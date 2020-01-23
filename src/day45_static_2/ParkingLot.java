package day45_static_2;

public class ParkingLot {
    public static void main(String[] args) {
        //print numberOfVehicles static way
        System.out.println(Vehicle.numberOfVehicles);
        //System.out.println(Vehicle.model); Model is non-static
        Vehicle v1 = new Vehicle("tesla cybertruck");
        System.out.println(Vehicle.numberOfVehicles);//1
        System.out.println(v1.numberOfVehicles);//1

        Vehicle v2 = new Vehicle("Ford f150");
        System.out.println(Vehicle.numberOfVehicles);//2
        System.out.println(v2.numberOfVehicles);//2

        Vehicle.numberOfVehicles = 10;
        System.out.println(v1.numberOfVehicles);
        System.out.println(v2.numberOfVehicles);

        Vehicle v3 = new Vehicle("Chevy Silverado");//Vehicle constructor runs
        System.out.println(Vehicle.numberOfVehicles);
        System.out.println(v1.numberOfVehicles);
        System.out.println(v2.numberOfVehicles);
        System.out.println(v3.numberOfVehicles);

        v2.numberOfVehicles = 300;
        System.out.println(Vehicle.numberOfVehicles);
        System.out.println(v1.numberOfVehicles);
        System.out.println(v2.numberOfVehicles);
        System.out.println(v3.numberOfVehicles);

        System.out.println(v1.getModel());
        System.out.println(v2.getModel());
        System.out.println(v3.getModel());

        v1.setModel("BMW 530i");

        System.out.println(v1.getModel());
        System.out.println(v2.getModel());
        System.out.println(v3.getModel());

    }
}
