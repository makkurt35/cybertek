package day47_inheritance_02;

public class EmployeesTest {
    public static void main(String[] args) {
        FulltimeEmployee ftEmployee = new FulltimeEmployee();
        FulltimeEmployee emp = new FulltimeEmployee("Jamil","SDET",5);
        System.out.println( emp.getName() );
        System.out.println(emp.getTitle());
        System.out.println(emp.getBonus());


    }
}
