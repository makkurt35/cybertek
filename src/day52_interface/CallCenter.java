package day52_interface;

public class CallCenter {
    public static void main(String[] args) {
        WhatsApp whatsApp = new WhatsApp();
        whatsApp.launch();
        whatsApp.allOSCompatible = true;
        whatsApp.isFree = true;
        whatsApp.name = "WhatsApp";
        whatsApp.call("Mr Nadir");
        whatsApp.sendMessage("Bless you!");
        whatsApp.videoCall();
        whatsApp.accept();

        VoiceCallable.decline();
        System.out.println(VoiceCallable.CAN_CALL);

    }
}
