package day54_polymorhism;

public class Diamond extends Shape {
    public Diamond(){
        type = "diamond";
    }


    @Override
    public void draw(){
        for (int i = 0; i < 5; i++)
            System.out.println("    *********".substring(i, 5 + 2*i));
        for (int i =5; i>0;i--)
            System.out.println("     **********".substring(i-1,5+(2*i)-3));
    }

    public void finalize(){
        System.out.println("Diamond object is about to Garbage collected...");
    }

}
