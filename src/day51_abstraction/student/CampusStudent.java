package day51_abstraction.student;

public class CampusStudent extends Student{

    int studentID;

    @Override
    public void attendClass(){
        System.out.println("CampusStudent attending class in Campus...");
    }

    public void playPingPong(){
        System.out.println("CampusStudent is playing ping pong...");
    }
}
