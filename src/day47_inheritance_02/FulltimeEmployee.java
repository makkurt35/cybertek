package day47_inheritance_02;

public class FulltimeEmployee extends Employee{

    public FulltimeEmployee(String name, String title, double bonus) {
        super(name, title);
        this.bonus = bonus;
    }

    public FulltimeEmployee(){
        super(); //if we dont add super, compiler will add
        System.out.println("FULLTIMEEMPLOYEE NO_ARGS Constructor");
    }

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
