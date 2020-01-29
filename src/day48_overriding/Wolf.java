package day48_overriding;

public class Wolf extends Animal{
    @Override
    public void speak() {
        System.out.println("Wolf is saying WOOOOO WOOOO...");
    }

    @Override
    public void move() {
        System.out.println("Wolf is hunting for food...");
    }

    @Override
    public void eat(String food){
        System.out.println("Wolf is eating [" + food + "]...");
    }
}
