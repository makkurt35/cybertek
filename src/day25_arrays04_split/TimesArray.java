package day25_arrays04_split;

public class TimesArray {
    public static void main(String[] args) {
        //Declare 2 int arrays: time1, time2 and assign values
                  //hours, minutes
                  //   0 , 1
        int[] time1 = {8, 45};
        int[] time2 = {4, 45};

        //Homework: Check if time1 and time2 have valid values
                    //hour - 0-23  minute -0-59

        //assume time1 and time2 have valid data

        //compare hours first

        if(time1[0] < time2[0]){
            System.out.println("Time1 is earlier "+time1[0]+":"+time1[1]);
        }else if(time2[0] < time1[0]){
            System.out.println("Time2 is earlier "+time2[0]+":"+time2[1]);
        }else if(time1[1] < time2[1]) { //compare minutes
            System.out.println("Time1 is earlier "+time1[0]+":"+time1[1]);
        }else if(time2[1] < time1[1]){
            System.out.println("Time2 is earlier "+time2[0]+":"+time2[1]);
        }else{
            System.out.println("Time1 and Time2 are same " + time1[0]+":"+time1[1]);
        }

        String str;


    }
}
