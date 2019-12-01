package day17_while_do_while_loop;

import java.util.Scanner;

public class FlipFlop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 words");
        String words = scan.nextLine();

        System.out.println("space is at index " + words.indexOf(" "));
        int spaceIdx = words.indexOf(" ");
        System.out.println(words.substring(0,spaceIdx));
        System.out.println(words.substring(spaceIdx+1));

        String word1 = words.substring(0,spaceIdx).toUpperCase();
        String word2 = words.substring(spaceIdx+1).toUpperCase();

        System.out.println(word2+" "+word1);

        String newWord = word2+" "+word1;
        System.out.println("newWord = " + newWord);

    }
}
