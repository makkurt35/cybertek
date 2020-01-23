package day45_static_2;

public class VariableAccess {

    int instanceCount = 10;

    static int staticCount = 15;

    public static void staticMethod(){
        //System.out.println("instanceCount: " + instanceCount);
        System.out.println("staticCount: "+ staticCount);
    }

    public void nonStaticInstanceMethod(){
        System.out.println("instanceCount = " + instanceCount);
        System.out.println("staticCount = " + staticCount);
    }

    public static void main(String[] args) {
        //variable access
        //System.out.println("instanceCount = " + instanceCount); ERROR
        System.out.println("staticCount = " + staticCount);

        //method access
        staticMethod();
        //nonStaticInstanceMethod(); ERROR

        //how to access instance(non-static) variable/method
        //first create object using NEW keyword
        VariableAccess vbObj = new VariableAccess();

        System.out.println("instanceCount = " + vbObj.instanceCount);
        vbObj.nonStaticInstanceMethod();
    }
}
