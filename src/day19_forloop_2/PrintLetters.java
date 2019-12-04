package day19_forloop_2;

public class PrintLetters {
    public static void main(String[] args) {
        //             0123456
        String name = "Murodil";

        for(int i = 0;i < name.length();i++){
            System.out.println(i +":"+name.charAt(i));
        }

        //Print your name in reverse
        for (int idx = name.length()-1;idx >= 0; idx--){
            //System.out.println(idx +"-"+name.charAt(idx));
            System.out.print(name.charAt(idx));
        }

    }
}
