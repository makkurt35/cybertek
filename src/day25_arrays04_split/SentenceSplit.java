package day25_arrays04_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        //find out how many words in the sentence and print
        //"Number of words: 3"
        String[] words = sentence.split(" ");
        System.out.println("Number of words: " + words.length);

        //print everything in same line
        for(int i = 0; i < words.length; i++){
            System.out.print(words[i]+" ");
        }
        System.out.println();
        //print everything in reverse order in same line
        String reversed = "";
        for(int i = words.length-1; i >= 0; i--){
            System.out.print(words[i]+" ");
            reversed += words[i]+" ";
        }
        System.out.println("\nreversed = " + reversed.trim());//remove last space

    }
}
