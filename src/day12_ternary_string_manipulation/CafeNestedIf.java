package day12_ternary_string_manipulation;

public class CafeNestedIf {
    public static void main(String[] args) {
        String order = "fruit";
        String drink = "soda";
        String food = "salad";
        double price = 0;

        //OUTER IF STATEMENT
        if(order.equals("drink")){
            //INNER IF STATEMENT. Will run only when order is drink
            if(drink.equals("soda")){
                price = 1.99;
            }else if(drink.equals("coffee")){
                price = 4.99;
            }else if(drink.equals("water")){
                price = 1.55;
            }else{
                System.out.println("No such drink available");
            }
        }else if (order.equals("food")){
            //INNER/NESTED IF STATEMENT
            if(food.equals("sandwich")){
                price = 7.45;
            }else if(food.equals("soup")){
                price = 6.33;
            }else if(food.equals("salad")){
                price = 9.99;
            }else{
                System.out.println("no such food available");
            }
        }else{
            System.out.println("No such order available");
        }

        System.out.println("Total Price: $" + price);

    }
}
