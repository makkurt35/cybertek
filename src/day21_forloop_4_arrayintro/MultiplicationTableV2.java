package day21_forloop_4_arrayintro;

public class MultiplicationTableV2 {
    public static void main(String[] args) {
        for(int outer = 1; outer<= 10; outer++) {
            if(outer ==1 || outer ==2){
                continue;//skip the iteration here. go back up
            }

            System.out.println("\nTABLE FOR #"+ outer);
            System.out.println("-------------");
            for(int inner = 1; inner <= 10; inner++){
                int result = inner * outer;
                System.out.println(inner + " x "+outer+" = "+result);
            }

        }

    }
}
