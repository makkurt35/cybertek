package day48_overriding;

public class Animal {
    public void speak(){
        System.out.println("Animal is speaking...");
    }

    public void move(){
        System.out.println("Animal is moving...");
    }

    public void eat(String food){
        System.out.println("Animal is eating "+food+"...");
    }

}
