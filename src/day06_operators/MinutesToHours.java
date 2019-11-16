package day06_operators;

public class MinutesToHours {
    public static void main(String[] args)
    {

        int minutes = 1000;
        int hours = minutes / 60;
        System.out.println(hours);
        //calculate remainder minutes and assign to variable
        int remainingMinutes = minutes % 60;
        System.out.println(remainingMinutes);
        //print in this format: 2 hours 15 minutes
        System.out.println(hours + " hours "+remainingMinutes +" minutes");




    }
}
