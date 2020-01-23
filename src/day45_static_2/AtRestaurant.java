package day45_static_2;

public class AtRestaurant {
    public static void main(String[] args) {
        Dinner Mom = new Dinner();
        Dinner Dad = new Dinner();
        Dinner kid = new Dinner();

        System.out.println("Total slices: " + Dinner.pizzaSlices);

        kid.takeASlice();
        Mom.takeASlice();
        Dad.takeASlice(2);

        System.out.println("Total slices: " + Dinner.pizzaSlices);
        System.out.println("Kid: "+ kid.pizzaSlices);
        System.out.println("Mom: "+ Mom.pizzaSlices);
        System.out.println("Dad: "+ Dad.pizzaSlices);

        Mom.takeASlice();
        kid.takeASlice(2);
        Dad.takeASlice();

        System.out.println("Total slices: " + Dinner.pizzaSlices);
        System.out.println("Kid: "+ kid.pizzaSlices);
        System.out.println("Mom: "+ Mom.pizzaSlices);
        System.out.println("Dad: "+ Dad.pizzaSlices);

        Dad.pizzaSlices = 8;

        System.out.println("Total slices: " + Dinner.pizzaSlices);
        System.out.println("Kid: "+ kid.pizzaSlices);
        System.out.println("Mom: "+ Mom.pizzaSlices);
        System.out.println("Dad: "+ Dad.pizzaSlices);




    }
}
