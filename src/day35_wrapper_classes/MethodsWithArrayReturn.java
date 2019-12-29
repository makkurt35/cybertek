package day35_wrapper_classes;
import java.util.*;
public class MethodsWithArrayReturn {

    public static void main(String[] args) {
        System.out.println(getDays());//HashCode

        String[] strArr = getDays();
        System.out.println(Arrays.toString(strArr));

        System.out.println( Arrays.toString( getDays() ) ) ;

        for( String day : getDays()){
            System.out.println(day);
        }

    }

    public static String[] getDays(){
        String[] days = {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat" ,"Sun"};
        return days;
    }

}
