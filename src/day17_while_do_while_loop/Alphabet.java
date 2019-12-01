package day17_while_do_while_loop;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'a';
//        letter++; //b
//        letter++; //c
//        System.out.println("letter = " + letter);//c

        while(letter <= 'z'){
            System.out.print(letter+" ");
            letter++;
        }
        System.out.println("letter = " + letter);
        //print alphabet in reverse
        //letter--;//'z'
        letter = 'z';
       // char reversed = 'z';
        while(letter >= 'a'){
            System.out.print(letter +" ");
            letter--;
        }

        /*
        A
        AB
        ABC
        ABCD
        ABCDE
        ABCDEF
        .....
         */
        System.out.println();
        String letters = "";
        char l = 'A';
        letters += l;
        l = 'B';
        letters += l;
        System.out.println("letters = " + letters);

        char myLetter = 'A';
        String alphabet = "";

        while(myLetter <= 'Z'){
            //attach/concatenate myLetter to alphabet
            alphabet += myLetter;//alphabet = alphabet + myLetter;
            //print alphabet
            System.out.println(alphabet);
            //increase myLetter by one
            myLetter++;
        }
    }
}
