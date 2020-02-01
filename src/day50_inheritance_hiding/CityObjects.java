package day50_inheritance_hiding;

public class CityObjects {
    public static void main(String[] args) {
        City city = new City("Calamba");
        CapitalCity capital = new CapitalCity("Moscow" , "Russia", 20000000L);

        System.out.println(city.toString());
        System.out.println(capital.toString());

        //static way of calling: ClassName.methodName
        //City.buildARoad();
        //CapitalCity.buildARoad();

        //call using object
        city.buildARoad();
        capital.buildARoad();
        System.out.println("---- TESTING HIDING ----");
        //Test method hiding
        CapitalCity astana = new CapitalCity("Astana", "Kazakhstan",2000000L);
        astana.letsBuildARoad();//this calling buildARoad which is hidden

        City karaganda = new City("Karaganda");
        karaganda.letsBuildARoad();
        //==============
        /*
        letsBuildARoad() method is in City class
        letsBuildARoadInCapital() method is in CapitalCity class
        both of them are calling buildARoad() method
         */

        CapitalCity ankara = new CapitalCity("Ankara", "Turkey",8000000L);
        ankara.letsBuildARoad(); //Code will run in City class/parent class
        //ankara.letsBuildARoad(); -> calls buildARoad() in City class.
        ankara.letsBuildARoadInCapital();//Code will run in CapitalCity class
        //ankara.letsBuildARoadInCapital(); -> calls  buildARoad() in CapitalCity
        //DONT SKIP NADIR CLASSES!!!BELIEVE IN YOURSELF!!!!
    }
}
