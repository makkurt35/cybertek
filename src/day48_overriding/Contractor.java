package day48_overriding;

public class Contractor extends Employee{
    @Override
    public void calculatePay(int hours, double rate) {
        System.out.println("Contractor total pay: " + (hours * rate + 200) );
    }

    @Override
    public String toString(){
        return "Contractor toString() | " + super.toString();
    }
}
