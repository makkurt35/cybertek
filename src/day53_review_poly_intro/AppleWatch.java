package day53_review_poly_intro;

public class AppleWatch extends AppleDevice implements Wearable{
    int series;

    public void countSteps(){
        System.out.println(name+" series "+series+"- counting each step...");
    }

    @Override
    public void use(){ //AppleDevice
        System.out.println("AppleWatch series "+series+"- using to check time, heartrate, exercise, applepay...");
    }

    @Override
    public void wear(){ //Wearable
        System.out.println("AppleWatch series "+series+"- wear in wrist, neck...");
    }

}
