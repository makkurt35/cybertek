package day10_switch_logical_operators;
/*
    if currentSpeed is more than 90
        "Jail Time"
    else if currentSpeed is more than 80
        "Reckless Driving"
    else if currentSpeed is more than 70
        "Speeding Ticket and points"
    else if currentSpeed is more than 60
        "Warning"
    else
        "Keep driving And thinking Java"
 */
public class SpeedingCheck {
    public static void main(String[] args) {
        int currentSpeed = 66;

        if(currentSpeed > 90) {
            System.out.println("Jail Time");
        }else if(currentSpeed > 80) {
            System.out.println("Reckless Driving");
        }else if(currentSpeed > 70){
            System.out.println("Speeding ticket and points");
        }else if(currentSpeed > 60) {
            System.out.println("Warning");
        }else{
            System.out.println("Keep driving and thinking Java");
        }

    }
}
