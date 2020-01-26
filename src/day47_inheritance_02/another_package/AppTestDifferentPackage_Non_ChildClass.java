package day47_inheritance_02.another_package;

import day47_inheritance_02.App;

public class AppTestDifferentPackage_Non_ChildClass {
    public static void main(String[] args) {
        App app = new App();
        app.name = "Day one";
        //protected. not visible to NON-SUBCLASS in different package
        //app.developer = "Bloom Built Inc";

        //default. Only visible in same package
       // app.system = "iOS";

        //Private Only visible in same class
       // app.price = 0.0;
    }
}
