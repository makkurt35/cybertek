package day32_custommethods;

public class VotingCheck {
    public static void main(String[] args) {
        checkIfCanVote(44);
        checkIfCanVote(15);
        printAge(1999);//20

        printAge(1887);
        printAge(1985);
        printAge(2001);
    }

    /*
    Method: checkIfCanVote
    Input: int age
    if age is 18 or more
        print "You are eligible to vote"
    else
	    print "You are not eligible to vote"
	  checkIfCanVote(22);
     */
    public static void checkIfCanVote(int age){
        if(age >= 18){
            System.out.println(age +" - You are eligible to vote");
        }else{
            System.out.println(age +" - You are not eligible to vote");
        }
    }

    /*
    Method:
	printAge
    input/param: int birthYear
     */

    public static void printAge(int birthYear){
        int age = 2019 - birthYear;
        System.out.println("birthYear :"+ birthYear+". age: " + age);
    }

}
