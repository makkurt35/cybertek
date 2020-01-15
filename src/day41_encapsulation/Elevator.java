package day41_encapsulation;

public class Elevator {

    private int currentFloor; //0 is default
    //newFloor -> 3
    public void gotoFloor(int newFloor){
        //check if newFloor is out of range
        if (newFloor < 0 || newFloor > 6){
            System.out.println("ERROR: Wrong floor selected : " + newFloor);
            return; //exit method
        }

        if(newFloor > currentFloor){
            for (int i = currentFloor+1; i <= newFloor; i++) {
                System.out.println("going up to floor " + i);
            }
        }else if (newFloor < currentFloor){
            for (int i = currentFloor - 1; i >= newFloor ; i--) {
                System.out.println("going down to floor " + i);
            }
        }else if(currentFloor == newFloor){
            System.out.println("WARNING: You are already in floor " + newFloor);
        }

        currentFloor=newFloor;

    }

}
