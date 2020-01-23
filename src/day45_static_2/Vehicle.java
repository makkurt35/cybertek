package day45_static_2;

public class Vehicle {
    private String model;//instance variable, we need object to use it
    public static int numberOfVehicles=0;//static variable, no need for object

    public Vehicle() {
        System.out.println("Parking a Unknown model Vehicle");
        numberOfVehicles++;
    }

    public Vehicle(String model) {
        System.out.println("Parking "+model);
        this.model = model;
        numberOfVehicles++;//add 1
    }

    public void leaveParkingLot(){
        numberOfVehicles--;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                '}';
    }

}
