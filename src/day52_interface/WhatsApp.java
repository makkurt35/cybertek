package day52_interface;
//
public class WhatsApp extends MessagingApp implements VoiceCallable,VideoCallable{

    @Override
    public void sendMessage(String msg) {
        System.out.println("WhatsApp - sending a message - " + msg + "...");
    }

    @Override
    public void videoCall() {
        System.out.println("WhatsApp - doing a video call Mr Nadir...");
    }

    @Override
    public void call(String contact) {
        System.out.println("Whats App - calling " + contact + "...");
    }
}
