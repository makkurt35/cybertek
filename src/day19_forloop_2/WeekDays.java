package day19_forloop_2;

public class WeekDays {

    public static void main(String[] args) {
        //Write a for loop that will iterate from 1-7
        for(int n = 1; n <= 15; n++){
            //System.out.println("n: " + n);
            switch(n){
                case 1:
                    System.out.println(n + ". Monday");
                    break;
                case 2:
                    System.out.println(n + ". Tuesday");
                    break;
                case 3:
                    System.out.println(n + ". Wednesday");
                    break;
                case 4:
                    System.out.println(n + ". Thursday");
                    break;
                case 5:
                    System.out.println(n + ". Friday");
                    break;
                case 6:
                    System.out.println(n + ". Saturday" );
                    break;
                case 7:
                    System.out.println(n + ". Sunday");
                    break;
                default:
                    System.out.println(n+" - No such day, it is java day");
            }

        }

    }
}
