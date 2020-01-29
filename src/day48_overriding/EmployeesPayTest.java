package day48_overriding;

public class EmployeesPayTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.calculatePay(40, 65);

        Contractor contractor = new Contractor();
        contractor.calculatePay(40, 65);

        FulltimeEmployee ftEmp = new FulltimeEmployee();
        ftEmp.calculatePay(40, 65);

        System.out.println(emp.toString());
        System.out.println(contractor.toString());
        System.out.println(ftEmp.toString());

    }
}
