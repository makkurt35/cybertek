package day27_arrays06;

public class Encryption {
    public static void main(String[] args) {
                         //0123456789..
        String alphabet = "abcdefghijklmnopqrstuvwxyz ";
        String encrypted ="zyxwvutsrqponmlkjihgfedcba ";

        String letter = "a";
        //encrypt letter
        //find the index of letter 'a' in alphabet
        int idx = alphabet.indexOf(letter);//0
        //read character at same index from encrypted
        System.out.println(encrypted.charAt(idx));
        System.out.println(letter +" => " +encrypted.charAt(idx));
        //===============
        String word = "java";
        String encWord = "";
        //encrypt this. 4 letters in word. No Loop please!
        char first  = word.charAt(0);//j
        char second = word.charAt(1);//a
        char third  = word.charAt(2);//v
        char fourth = word.charAt(3);//a

        int i1 = alphabet.indexOf(first);//9
        int i2 = alphabet.indexOf(second);//0
        int i3 = alphabet.indexOf(third); //21
        int i4 = alphabet.indexOf(fourth);//0

        char encr1 = encrypted.charAt(i1);//q
        char encr2 = encrypted.charAt(i2);//z
        char encr3 = encrypted.charAt(i3);//e
        char encr4 = encrypted.charAt(i4);//z

        encWord = ""+encr1+encr2+encr3+encr4;
        System.out.println("word = " + word);
        System.out.println("encWord = " + encWord);

        //TASK 2. assign a new word and encrypt each letter using a for loop
        String word2 = "happy birthday fernando";
        String encryptedWord = "";

        for(int i = 0; i < word2.length(); i++){
            //1. read a letter from word2 - index i
            char myLetter = word2.charAt(i);
            //2. Find the index of myLetter in alphabet
            int index = alphabet.indexOf(myLetter);
            //3. Read the letter at position index from encrypted. and store into char
            char enc = encrypted.charAt(index);
            //4. add enc to encryptedWord variable
            encryptedWord += enc;
        }

        System.out.println("encryptedWord = " + encryptedWord);

        //TASK 3. declare word3 and assign some encrypted message
        //Decrypt it!
        String word3 = "qzez rh ufm";
        String decryptedWord = "";

        for (int i = 0; i < word3.length(); i++) {
            //1.  read a letter from word3 - index i and store into myLetter
            char myLetter = word3.charAt(i);
            //2. find the position/index of myLetter in encrypted and save into iidx
            int iidx = encrypted.indexOf(myLetter);
            //3.  Read the letter at position iidx from alphabet. and store into char
            char dec = alphabet.charAt(iidx);
            //4. add the dec value into
            decryptedWord += dec;
        }

        System.out.println("word3 = " + word3);
        System.out.println("decryptedWord = " + decryptedWord);

    }
}










