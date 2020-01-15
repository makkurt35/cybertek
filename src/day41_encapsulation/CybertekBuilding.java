package day41_encapsulation;

public class CybertekBuilding {
    public static void main(String[] args) {
        Elevator elevator1 = new Elevator(); //floor is 0 by default
        elevator1.gotoFloor(3);
        System.out.println("---------------");
        elevator1.gotoFloor(5);
        elevator1.gotoFloor(2);
        System.out.println("================");
        elevator1.gotoFloor(7);

        //elevator1.currentFloor = 11;
        elevator1.gotoFloor(4);
    }
}
