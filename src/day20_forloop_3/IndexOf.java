package day20_forloop_3;

public class IndexOf {
    public static void main(String[] args) {
        String word = "Java is fun";
        //lets not convert to lowercase
        char letter = 'q';//we will look for this letter in the word
        //position of a letter - assume not there and assign -1
        int index = -1;

        //loop from first char until last
        for(int i = 0; i < word.length(); ++i){
            //System.out.println(word.charAt(i));
            if(word.charAt(i) == letter){
                index = i;
                break; //exit the loop here. no need to read other chars
                //System.out.println(letter +" found at " + i);
            }
        }

        System.out.println(letter +" was found at index #"+index);

    }
}
