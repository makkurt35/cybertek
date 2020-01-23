package day45_static_2;

public class Dinner {
    public static int pizzaSlices = 8;

    public void takeASlice(){
        pizzaSlices--;
    }

    public void takeASlice(int count){
        pizzaSlices -= count;
    }
}
