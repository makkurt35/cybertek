package day47_inheritance_02;

public class AppTestSamePackageNonChildClass {
    public static void main(String[] args) {
        App app = new App();
        app.name = "Evernote";
        app.developer = "Evernote LLC";
        app.system = "iOS, Android, Google";
        //app.price = 22.33; Private
    }
}
