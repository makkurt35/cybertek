package day34_methodspractice;

public class StringActions {

    public static void main(String[] args) {
        int num = countWords("java is fun"); // 3
        System.out.println("num = " + num);

        System.out.println(countWords("java"));
        System.out.println(countWords(""));

        System.out.println("a in java : " + countChars("java", 'a'));
        System.out.println("q in java : " + countChars("java", 'q'));
        System.out.println("@ in '' : " + countChars("", '@'));

        //call countChars and save return value into variable
        int countOfChars = countChars("String value", 'v');
        System.out.println("countOfChars = " + countOfChars);
        
    }
    /*
    Method: countChars
    Input/Params: String str, char ch
    return: int
     */
    public static int countChars(String str, char ch){
        int count = 0;
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }

    /*
    Method: countWords
    input/param: String sentence
    return: int
     */
    public static int countWords(String sentence){
        if (sentence.isEmpty()){
            return 0;
        }else {
            String[] array = sentence.split(" ");
            return array.length;
        }
    }
}
