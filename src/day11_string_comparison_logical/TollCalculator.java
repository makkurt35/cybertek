package day11_string_comparison_logical;

public class TollCalculator {
    public static void main(String[] args) {
        String vehicleType = "truck";
        boolean isRushHour = true;

        double tollPrice = 0;
        //-> "car" and no rushhour ==> 3.0
        if(vehicleType.equalsIgnoreCase("CAR") && isRushHour==false){
            tollPrice = 3.0;
            System.out.println("Vehicle type: Car. Non-Rush hour");
        }else if(vehicleType.equalsIgnoreCase("car") && isRushHour){
            tollPrice = 7.50;
            System.out.println("Vehicle Type: Car. Rush Hour");
        }else if(vehicleType.equalsIgnoreCase("truck") && !isRushHour){
            tollPrice = 4.75;
            System.out.println("Vehicle Type: Truck. Non-Rush hour");
        }else if(vehicleType.equalsIgnoreCase("truck") && isRushHour){
            tollPrice = 11.50;
            System.out.println("Vehicle Type: Truck. Rush hour");
        }else{
            System.out.println("Vehicle not recognized, use a different road");
        }

        System.out.println("Toll cost: $"+tollPrice);

    }
}
