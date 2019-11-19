package day08_if_statements;

public class ExamResult {
    public static void main(String[] args) {
        int score = 100;

        if (score >= 60){
           System.out.println("Congratulations, you passed the exam!");
        }else{
            System.out.println("You failed");
            System.out.println("Please study more and try again. Don't be sad");
        }
    }
}
