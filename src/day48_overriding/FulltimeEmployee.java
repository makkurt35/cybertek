package day48_overriding;

public class FulltimeEmployee extends Employee{
    @Override
    public void calculatePay(int hours, double rate) {
        System.out.println("FullTimeEmployee total pay: " + (hours * rate) * 1.25);
    }

    @Override
    public String toString(){
        System.out.println("Parent version: " + super.toString());
        return "FulltimeEmployee toString()";
    }
}
