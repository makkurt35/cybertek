package day20_forloop_3;

public class PrintByPortion {
    public static void main(String[] args) {
        //String str = "pizza, soup, chicken, kebab, shrimp, ice cream";
        //java code
        //jav
        //a c
        //
        String str = "my cat, your dog";
        for(int n = 0; n < str.length()-2;n++){
            //System.out.println(str.charAt(n)+""+str.charAt(n+1)+""+str.charAt(n+2));
            System.out.println(str.substring(n,n+3));
            if(str.substring(n , n+3).equals("cat")){
                System.out.println("cat found");
            }
        }

    }
}
