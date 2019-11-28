package day15_string_manipulation;

public class StringReplace {
    public static void main(String[] args) {
        String words = "sad, cry, python";
        System.out.println(words.replace("sad" , "happy"));
        System.out.println(words.replace("cry","smile"));
        System.out.println(words.replace("python","java"));

        System.out.println("words = " + words);
        words = words.replace("sad", "happy");
        words = words.replace("cry","smile");
        words = words.replace("python","java");

        System.out.println("words = " + words);//happy, smile, java
        //change "smile"  to "SMILE"
        System.out.println(words.replace("smile", "SMILE"));

        //happy, smile, java --> happy|smile|java
        words = words.replace(", ","|");
        System.out.println("words = " + words);
        
        String capital = "London is capital of UK";
        capital = capital.replace("London","Washington DC");
        capital = capital.replace("UK", "USA");

        System.out.println("capital = " + capital);

        capital = capital.replace("Washington DC","Ankara")
                         .replace("USA","Turkey");

        System.out.println("capital = " + capital);

    }
}
