package day48_overriding;

public class AnimalFriends {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak();
        animal.move();

        Cat cat = new Cat();
        cat.speak();
        cat.move();

        Horse pony = new Horse();
        pony.speak();
        pony.move();

        Wolf greyWolf = new Wolf();
        greyWolf.speak();
        greyWolf.move();

        animal.eat("apples");
        cat.eat("fish");
        pony.eat("Hay with carrots");
        greyWolf.eat("sheep meat");
    }
}
