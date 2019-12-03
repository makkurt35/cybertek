package day18_for_loop;

public class PrintStars {
    public static void main(String[] args) {
        for(int star = 1; star <= 10; star++){
            System.out.print("* ");
        }

        System.out.println();
        String myStars = "";
        int starsCount = 10;
        /*
           Assign stars to myStars String variable.
           Count of stars must match value of starsCount
         */
        for(int i = 1; i <= starsCount; i++){
           // System.out.print("* ");
            myStars += "* ";
        }


        System.out.println("myStars = " + myStars);


    }
}
