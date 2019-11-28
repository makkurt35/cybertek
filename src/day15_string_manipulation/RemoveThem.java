package day15_string_manipulation;

public class RemoveThem {
    public static void main(String[] args) {
        String sentence = "Java is fun";//Javaisfun
        //" " => ""
        String withNoSpaces = sentence.replace(" ","");
        System.out.println("sentence = " + sentence);
        System.out.println("withNoSpaces = " + withNoSpaces);
        //remove 'is'
        System.out.println(sentence.replace(" is ", ""));

        String etsyResult = "iphone case (212,713 Results)";
        etsyResult = etsyResult.replace("iphone case (","");//212,713 Results)
        etsyResult = etsyResult.replace(",","");//212713 Results)
        etsyResult = etsyResult.replace(" Results)", "");//212713

        System.out.println("etsyResult = " + etsyResult);// 212713

        String mixed = "!@J#$A%^VA*(";
        
        mixed = mixed.replace("!@","") //J#$A%^VA*(
                     .replace("#$","")//JA%^VA*(
                     .replace("%^","")//JAVA*(
                     .replace("*(","");//JAVA
        System.out.println("mixed = " + mixed);

    }
}
