package day44_static;

import java.util.*;

public class Starbucks {

    /*Method: drinkCoffee
        param: Coffee coffeeObj
        return: void
        Drinking cappuccino and coding java
        Coffee latte = new Coffee("Latte", "tall", 4.33);
        Ex: drinkCoffee(latte);
    */
    public static void drinkCoffee(Coffee coffeeObj){
        System.out.println("Drinking "+coffeeObj.getName()+" and coding java");
    }

    /*Method: orderCoffee
       param: String coffeeName, String coffeeSize
       Return: Coffee
       Create coffeeObj using coffeeName,coffeeSize, 43.99
       and return from method
       Ex:
       Coffee myCoffee=orderCoffee("White Mocha", "grande");
    */

    public static Coffee orderCoffee(String coffeeName, String coffeeSize){
        System.out.println("Preparing "+coffeeSize+" "+coffeeName);
        Coffee readyCoffee = new Coffee(coffeeName, coffeeSize, 0.99) ;
        return readyCoffee;

    }


    public static void main(String[] args) {
        Coffee cappuccino = new Coffee("cappuccino", "grande", 3.99);
        cappuccino.drink();
        System.out.println(cappuccino.toString());

        //syntax for array of Coffees
        Coffee[] coffeeArray = new Coffee[2];
        coffeeArray[0] = cappuccino;
        coffeeArray[1] = new Coffee("Latte", "venti", 5.99);

        System.out.println(Arrays.toString(coffeeArray));

        //ArrayList of Coffees
        List<Coffee> coffeeList = new ArrayList<>();
        coffeeList.add(cappuccino);
        coffeeList.add(coffeeArray[1]);
        coffeeList.add(new Coffee("Nitro Brew", "tall", 3.49));

        System.out.println(coffeeList.toString());

        //drink first coffee
        coffeeList.get(0).drink();

        //drink all of them
        for (Coffee eachCoffee : coffeeList){
            eachCoffee.drink();
        }

        System.out.println("---- CALL CUSTOM METHOD - DRINKCOFFEE ----");
        Coffee hotChocolate = new Coffee("Hot Chocolate", "venti", 4.99);
        //call the method and pass the Coffee object
        drinkCoffee(hotChocolate);
        drinkCoffee(cappuccino);
        drinkCoffee(new Coffee("Mocha" , "tall" , 4.79));

        System.out.println(" ---- CALL ORDERCOFFEE METHOD ---");
        Coffee myCoffee=orderCoffee("white mocha", "grande");

        myCoffee.drink();
        System.out.println(myCoffee.toString());

        Coffee myVentiLatte=orderCoffee("Vanilla Latte" , "venti");
        myVentiLatte.drink();
    }
}
