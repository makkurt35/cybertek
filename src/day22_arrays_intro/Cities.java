package day22_arrays_intro;

public class Cities {
    public static void main(String[] args) {
        String[] cities = {"Ankara", "Moscow", "Baku", "Kabul",
                "Manila","Tashkent","Bucharest"};

        for(String city : cities){
            System.out.println(city +" "+city.toUpperCase());
        }

        //print city only if its name is more than 6 character
        for(String city : cities){
            if(city.length() > 6) {
                System.out.println(city + " " + city.toUpperCase());
            }
        }

        //print only cities that contain 'u'
        for(String city : cities) {
            if(city.contains("u")){
                System.out.println(city + " " + city.toUpperCase());
            }
        }

    }
}
