package day11_string_comparison_logical;
import java.util.Scanner;
public class SeasonFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month:");
        int month = scan.nextInt();
        //Spring -> 3,4,5
        if(month >= 3 && month <= 5){
            System.out.println("it is Spring");
        }else if(month >= 6 && month <= 8){
            System.out.println("It is Summer");
        }else if(month >= 9 && month <= 11){
            System.out.println("It is Fall");
        }else if(month == 12 || month == 1 || month == 2){
            System.out.println("It is Winter");
        }else{
            System.out.println("Invalid month");
        }

        switch(month){ //with OR || logic comparison
            case 3: case 4: case 5:
                System.out.println("it is Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("It is Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("It is Fall");
                break;
            case 12: case 1: case 2:
                System.out.println("It is Winter");
                break;
            default:
                System.out.println("Invalid Month!");
        }

    }
}
