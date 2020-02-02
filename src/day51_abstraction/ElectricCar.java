package day51_abstraction;

public abstract class ElectricCar  {
    public abstract void start();//WHAT TODO, instead of HOW TODO. HIDE IMPLEMENTATION
    public abstract void charge();
    public abstract void drive();

    public void stop(){
        System.out.println("Electric car is stopping by pushing break...");
    }
}
