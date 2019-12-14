package day26_arrays05;

import java.util.Arrays;

public class PopularNames {
    public static void main(String[] args) {
        String[] names = {  "James","Mary",
                "John","Patricia",
                "Robert","Jennifer",
                "Michael","Linda",
                "William","Elizabeth",
                "David","Barbara",
                "Richard","Susan",
                "Joseph","Jessica",
                "Thomas","Sarah",
                "Charles","Margaret",
                "Christopher","Karen",
                "Daniel","Nancy",
                "Matthew","Lisa",
                "Anthony","Betty",
                "Donald","Dorothy",
                "Mark","Sandra",
                "Paul","Ashley",
                "Steven","Kimberly",
                "Andrew","Donna",
                "Kenneth","Emily",
                "George","Carol",
                "Joshua","Michelle",
                "Kevin","Amanda",
                "Brian","Melissa",
                "Edward","Deborah",
                "Ronald","Stephanie",
                "Timothy","Rebecca",
                "Jason","Laura",
                "Jeffrey","Helen",
                "Ryan","Sharon",
                "Jacob","Cynthia",
                "Gary","Kathleen",
                "Nicholas","Amy",
                "Eric","Shirley",
                "Stephen","Angela",
                "Jonathan","Anna",
                "Larry","Ruth",
                "Justin","Brenda",
                "Scott","Pamela",
                "Brandon","Nicole",
                "Frank","Katherine",
                "Benjamin","Samantha",
                "Gregory","Christine",
                "Raymond","Catherine",
                "Samuel","Virginia",
                "Patrick","Debra",
                "Alexander","Rachel",
                "Jack","Janet",
                "Dennis","Emma",
                "Jerry","Carolyn",
                "Tyler","Maria",
                "Aaron","Heather",
                "Henry","Diane",
                "Jose","Julie",
                "Douglas","Joyce",
                "Peter","Evelyn",
                "Adam","Joan",
                "Nathan","Victoria",
                "Zachary","Kelly",
                "Walter","Christina",
                "Kyle","Lauren",
                "Harold","Frances",
                "Carl","Martha",
                "Jeremy","Judith",
                "Gerald","Cheryl",
                "Keith","Megan",
                "Roger","Andrea",
                "Arthur","Olivia",
                "Terry","Ann",
                "Lawrence","Jean",
                "Sean","Alice",
                "Christian","Jacqueline",
                "Ethan","Hannah",
                "Austin","Doris",
                "Joe","Kathryn",
                "Albert","Gloria",
                "Jesse","Teresa",
                "Willie","Sara",
                "Billy","Janice",
                "Bryan","Marie",
                "Bruce","Julia",
                "Noah","Grace",
                "Jordan","Judy",
                "Dylan","Theresa",
                "Ralph","Madison",
                "Roy","Beverly",
                "Alan","Denise",
                "Wayne","Marilyn",
                "Eugene","Amber",
                "Juan","Danielle",
                "Gabriel","Rose",
                "Louis","Brittany",
                "Russell","Diana",
                "Randy","Abigail",
                "Vincent","Natalie",
                "Philip","Jane",
                "Logan","Lori",
                "Bobby","Alexis",
                "Harry","Tiffany",
                "Johnny","Kayla"};
        System.out.println("Names count : "+ names.length);

        System.out.println(Arrays.toString(names));

        int sarahsIndex = -1;//assign -1. this value will stay, in case not found
        //loop through the names and find out where is "Sarah"
        for(int n = 0; n < names.length; n++){
            //System.out.println(names[n]);
            if(names[n].equals("Sarah")){
                sarahsIndex = n; //assing index of Sarah to sarahsIndex
                break;//exit loop.
            }
        }


        System.out.println("sarahsIndex = " + sarahsIndex);

        /*
        MALES NAMES:James, John...
        FEMALES NAMES: Mary, Patricia...
         */
        System.out.print("MALES NAMES:");
        for (int i = 0; i < names.length; i+=2) {
            System.out.print(names[i]+", ");
        }
        System.out.println();
        System.out.print("FEMALE NAMES:");
        for (int i = 1; i < names.length; i+=2) {
            System.out.print(names[i]+", ");
        }
        System.out.println();
        //solve above task using a single loop

        String maleNames = "";
        String femaleNames = "";

        for(int i = 0; i < names.length; i++){
            if(i % 2 == 0){
                maleNames += names[i]+", ";
            }else{
                femaleNames += names[i]+", ";
            }
        }

        System.out.println("MALE NAMES:"+maleNames);
        System.out.println("FEMALE NAMES:"+femaleNames);

        //check if "David" is among maleNames
        if(maleNames.contains("David")){
            System.out.println("David is in the list");
        }else{
            System.out.println("David is not in the list");
        }

        //check if "Susan" is among femaleNames
        if(femaleNames.contains("Susan")){// if(femaleNames.indexOf("Susan") > -1)
            System.out.println("Susan is in the list");
        }else {
            System.out.println("Susan is not in the list");
        }
        
        //find the person with longest and shortest name
        String longestName  = names[0];//James
        String shortestName = names[0];//James

        for (int i = 0; i < names.length; i++) {
            if(names[i].length() > longestName.length()){
                longestName = names[i];
            }
            
            if(names[i].length() < shortestName.length()){
                shortestName = names[i];
            }
        }

        System.out.println("longestName = " + longestName);
        System.out.println("shortestName = " + shortestName);
    }
}
