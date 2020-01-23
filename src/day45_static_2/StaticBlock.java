package day45_static_2;

public class StaticBlock {
    //static block
    static{
        System.out.println("STATIC BLOCK - ONCE BEFORE EVERYTHING ELSE");
    }

    public StaticBlock(){
        System.out.println("CONSTRUCTOR - RUNS EVERYTIME OBJECT IS CREATED");
    }

    public static void staticMethod(){
        System.out.println("STATIC METHOD");
    }

    public static class InnerClass{
        public static void innerClassStaticMethod(){
            System.out.println("Hello from Inner Class!!!");
        }
    }

}
