package day39_list_practice_custom_classes;

public class Company {
    public static void main(String[] args) {
        //create object from Employee custom class.
        //new keyword
        String str = new String();

        Employee emp = new Employee();
        emp.name = "Kate";
        emp.age = 33;
        emp.jobTitle = "QA Engineer";

        emp.work();


    }
}
