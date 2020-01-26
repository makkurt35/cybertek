package day46_inheritance_intro;

import day47_inheritance_02.SlackUser;

public class DevicesTest {
    public static void main(String[] args) {
        Device device = new Device();
        device.brand = "LG";
        device.price = 900;
        device.country = "South Korea";
        device.use();

        TV tv = new TV();
        tv.brand = "Sony";
        tv.price = 800;
        tv.country = "Japan";
        tv.screenSize = 66;
        tv.isSmart = true;
        tv.use();
        tv.watch();

        Phone phone = new Phone();
        phone.brand = "Apple iPhone";
        phone.price = 912.99;
        phone.country = "China";
        phone.carrier = "Sprint";
        phone.use();
        phone.call();
        phone.text("java is fun!");

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.brand = "Samsung Galaxy Note 10";//Device
        smartPhone.price = 899.0; //Device
        smartPhone.country = "South Korea"; //Device
        smartPhone.carrier = "Verizon"; //Phone
        smartPhone.memorySize = 128; // SmartPhone

        smartPhone.use(); //Device
        smartPhone.call();//Phone
        smartPhone.text("Inheritance is fun!"); //Phone
        smartPhone.useApp("Slack"); //SmartPhone


    }
}
