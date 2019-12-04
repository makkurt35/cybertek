package day19_forloop_2;

public class CountHowMany {
    public static void main(String[] args) {
        String str = "java loops are fun";
        int count = 0;
        char myChar = 'a';

        //loop from first until last letter
        //read each letter and compare if it equals to myChar
        //if true increase count by 1
        //After loop print "Count: 3"

        for (int i = 0; i < str.length(); i++){
            //System.out.println(str.charAt(i));
            if(str.charAt(i) == myChar){
                count++;
                System.out.println(myChar + " found at " + i);
            }
        }

        System.out.println("Count: " + count);
        System.out.println("There are " + count+ " ["+myChar+"] in ["+str+"]");

    }
}
