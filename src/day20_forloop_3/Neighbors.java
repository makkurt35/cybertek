package day20_forloop_3;
public class Neighbors {
    public static void main(String[] args) {
                                     // 012
        String str = new String("jaavvaa iis fuun");

        for(int idx = 0; idx < str.length()-1; idx++) {
          //  System.out.println(str.charAt(idx) + "" + str.charAt(idx+1));
            if(str.charAt(idx) == str.charAt(idx+1)){
                System.out.println("Beeep - " + str.charAt(idx));
            }
        }
        /*
        idx = 0
        idx + 1 -> 1
        ja

        idx = 1
        idx + 1 -> 2
        aa

        idx = 2
        idx + 1 => 3 --> ERROR

         */

    }
}
