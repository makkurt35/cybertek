package day47_inheritance_02;

public class SlackAdminUser extends SlackUser{
    int adminID;

    public void sendAtChannelMessage(String msg){
        System.out.println("SlackAdminUser ["+name+"] ["+adminID+"] is sending @channel msg...["+msg+"]");
    }

    public void deleteMessage(){
        System.out.println("SlackAdminUser ["+name+"] ["+adminID+"] is deleting a message..");
    }



}
