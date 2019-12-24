package day33_methods;

public class VoidMethodsPractice {
    public static void main(String[] args) {
        //call the method here.
        printDay(1);
        printDay(2);

        //call buildEmail method
        buildEmail("Mike Smith", "Google");
        buildEmail("Alina Popescu", "Deloitte");

        String name = "Luba Naseykina";
        String company ="Apple";
        buildEmail(name, company);

        //Call checkEligible
        checkEligible(641);

        int[] scores = {700, 570, 800};
        checkEligible(scores[0]);
        checkEligible(scores[1]);
        checkEligible(scores[2]);
        //TRY WITH A LOOP
        for(int each : scores){
            checkEligible(each);
        }
    }

    /*
    Name: checkEligible
    Input: int creditScore
    if creditScore >= 640
        "You are eligible for this loan"
    else
        "Sorry, you are not eligible for this loan"
     */

    public static void checkEligible(int creditScore){
        if (creditScore >= 640){
            System.out.println("Congratulations, You are eligible for this loan");
        }else{
            System.out.println("Sorry, you are not eligible for this loan");
        }
    }


    /*
    Method name: buildEmail
    Input/Params/Args: String name, String company
    - remove spaces from name and company
    - String email -> name@company.com
    -> print email
       buildEmail("Mike Smith", "Yahoo"); => "mikesmith@yahoo.com"
     */

    public static void buildEmail(String name, String company){
        name=name.replace(" ", "");
        company=company.replace(" ","");
        String email = name.toLowerCase()+"@"+company.toLowerCase()+".com";
        System.out.println(email);
    }



    public static void printDay(int day){

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day - Java Day!");
        }
    }
}
