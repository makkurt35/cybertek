package day47_inheritance_02;
import java.lang.*;

public class Employee extends Object{
    private String name;
    private String title;

    public Employee(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public Employee(){
        super();
        System.out.println("EMPLOYEE NO-ARGS Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
