package day11_string_comparison_logical;

public class WeatherIfElse {
    public static void main(String[] args) {
        String weather = "sunny";

        if(weather.equals("sunny") ) {
            System.out.println("go to park");
            System.out.println("Code Java");
        }else{
            System.out.println("go to school");
            System.out.println("Code java");
        }

        String item = "Wooden Spoon";

        if(item.equals("wooden spoon")){
            System.out.println("15,938 wooden spoons for sale");
        }else{
            System.out.println("no Wooden spoons ): ");
        }
                                           //"Wooden Spoon"
        if(item.equalsIgnoreCase("wooden spoon")){
            System.out.println("15,938 wooden spoons for sale");
        }else{
            System.out.println("no Wooden spoons ): ");
        }

    }
}
