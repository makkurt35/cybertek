package day48_overriding;

public class Cat extends Animal{
    public void speak(){
        System.out.println("Cat is saying MEOW MEOW...");
    }

    //override move()
    public void move(){
        System.out.println("Cat is running fast...");
    }

    @Override
    public void eat(String food){
        System.out.println("Cat is eating "+food+"...");
    }

}
