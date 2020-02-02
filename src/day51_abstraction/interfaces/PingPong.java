package day51_abstraction.interfaces;

public class PingPong implements Sport, CampusFriendly {

    @Override
    public void practice() {
        System.out.println("Ping Pong practice - during class break....");
    }

    @Override
    public void compete(String type) {
        System.out.println("Ping pong competition - " + type);
    }

    @Override
    public void installIndoors() {
        System.out.println("Install ping pong in study room....");
    }
}
