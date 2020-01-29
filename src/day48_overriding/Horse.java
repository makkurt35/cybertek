package day48_overriding;

public class Horse extends Animal{
    public void speak(){
        System.out.println("Horse is saying IAHAHAHA....");
    }

    @Override //Verify that move method is overridden
    public void move(){
        System.out.println("Horse is galloping....");
    }

    public void eat(String str){
        System.out.println("Horse is eating " +  str + "...");
    }
}
