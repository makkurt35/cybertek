package day47_inheritance_02;

public class SlackUser {
    protected String name;
    String status;

    public void sendMessage(String msg){
        System.out.println("SlackUser ["+name+"] with status ["+status+"] is typing...[" + msg +"]");
    }

    public void callSomeone(){
        System.out.println("SlackUser ["+name+"] is calling...");
    }

    public void addEmoji(String emoji){
        System.out.println("SlackUser ["+name+"] is adding emoji...[" + emoji +"]");
    }

}
