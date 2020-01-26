package day47_inheritance_02;

public class SlackWorkSpace {
    public static void main(String[] args) {
        SlackUser slackUser = new SlackUser();
        slackUser.name = "Imtiaz";
        slackUser.status = "Coding Java";
        slackUser.sendMessage("Make me admin please");
        slackUser.callSomeone();
        slackUser.addEmoji("Wooden Spoon");

        SlackAdminUser admin = new SlackAdminUser();
        admin.name = "Nadir";
        admin.status = "If Nadir did it, you can do it too!";
        admin.adminID = 12345;
        admin.sendAtChannelMessage("Keep coding and TALKING");
        admin.deleteMessage();
        admin.sendMessage("Quiz Today");
        admin.callSomeone();
        admin.addEmoji(":)");
    }
}
