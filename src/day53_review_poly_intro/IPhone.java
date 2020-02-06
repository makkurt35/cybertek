package day53_review_poly_intro;

public class IPhone extends AppleDevice implements Codeable , Wearable {
    String model;

    public void navigate(){
        System.out.println("IPhone - navigating using GoogleMap app...");
    }

    @Override
    public void use() {
        System.out.println(name+" model " + model +"- using to call, text, play games, music, flipgrid...");
    }

    @Override
    public void code() {
        System.out.println(name + " model " + model + " - coding java in repl.it, codingbat, notes...");
    }

    @Override
    public void wear() {
        System.out.println(name + " model " +  model + " - wearing on arm using case...");
    }
}
