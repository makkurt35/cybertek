package day53_review_poly_intro;

public class AppleStore {
    public static void main(String[] args) {
       // AppleDevice appDev = new AppleDevice(); Cannot instantiate
        AppleWatch iwatch = new AppleWatch();
        iwatch.name = "Apple Watch";
        iwatch.series = 5;
        iwatch.use();
        iwatch.wear();
        iwatch.countSteps();

        IPhone myPhone = new IPhone();
        myPhone.name = "iPhone";
        myPhone.model = "11 Pro";
        myPhone.use();
        myPhone.wear();
        myPhone.code();
        myPhone.navigate();

        MacPro macPro = new MacPro();
        macPro.name = "MacPro";
        macPro.model ="Cheese Grater";
        macPro.use();
        macPro.useAsServer();
        macPro.code();
        System.out.println(macPro.hashCode());

    }
}
