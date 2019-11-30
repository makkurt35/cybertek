package day16_memory_string_while_loop_intro;

public class StringPractice {
    public static void main(String[] args) {
        String word = "abc";//always 3 characters
        String reversed = "";//vaj

        /*
         read third letter from word
         and concatenate to reversed
         read second letter from word
         and concatenate to reversed
         read first letter from word
         and concatenate to reversed
         */

        System.out.println(word.charAt(2));
        reversed += word.charAt(2);//c
        System.out.println("reversed = " + reversed);

        reversed += word.charAt(1);//cb
        System.out.println("reversed = " + reversed);

        reversed += word.charAt(0);//cba
        System.out.println("reversed = " + reversed);
        
        String reversed2 = "";
        reversed2 = reversed2+word.charAt(2)+word.charAt(1)+word.charAt(0);
        System.out.println("reversed2 = " + reversed2);

        System.out.println(""+word.charAt(2)+word.charAt(1)+word.charAt(0));

        if(word.equals(reversed)){
            System.out.println("Palindrome 3letter word");
        }else{
            System.out.println("Non-palindrome 3 letter word");
        }

        String rev = "";
        rev = rev.concat("abc").concat("wzx");
        System.out.println(rev);

        rev = rev.concat(""+word.charAt(0));
        System.out.println(rev);

    }
}
