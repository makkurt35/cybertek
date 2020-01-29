package day48_overriding;

public class Employee extends Object{
    //@Override will show error since we are NOT overriding here
    public void calculatePay(int hours, double rate) {
        System.out.println("Employee total pay: " + (hours * rate));
    }

    @Override
    public String toString(){
       return "Employee toString() ";
    }
}
