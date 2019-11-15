package day05_practice_scanner_math;

public class SpeedCheck {
    public static void main(String[] args) {
        int speedLimit = 55;
        int currentSpeed = 70;
        int overTheLimit = currentSpeed - speedLimit;
        //You are driving 35 mph over the limit. Be careful! Slow Down!
        System.out.println("You are driving "+overTheLimit+" mph over the limit. Be careful! Slow Down!");
    }
}
