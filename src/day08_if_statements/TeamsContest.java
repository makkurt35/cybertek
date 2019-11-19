package day08_if_statements;

public class TeamsContest {
    public static void main(String[] args) {
        int cybertekTeamScore = 5;
        int micheganTeamScore = 10;

        if(cybertekTeamScore > micheganTeamScore) {
            System.out.println("Cybertek Team Won the match with score " + cybertekTeamScore);
            System.out.println("Go Cybertek Team!!!");
        }else{
            System.out.println("Michegan Team Won the match with score "+micheganTeamScore);
            System.out.println("Go Michegan Team!!!");
        }

    }
}
