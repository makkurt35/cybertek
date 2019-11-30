package day16_memory_string_while_loop_intro;

public class PrintLast {
    public static void main(String[] args) {
                     //01234
        String word = "Java is sooo much fun";
                    // 12345 <-- length()
        System.out.println(word.charAt(2));
        /*
         find out number of characters in String
         use that number as input to charAt method (-1)
         */
        System.out.println(word.length());
                                         //5
        System.out.println(word.charAt(word.length()-1));

        int count = word.length();//5
        System.out.println(word.charAt(count - 1));

    }
}
