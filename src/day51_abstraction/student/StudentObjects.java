package day51_abstraction.student;

public class StudentObjects {
    public static void main(String[] args) {
       // Student st = new Student(); ERROR
        CalambaStudent calamba = new CalambaStudent();
        calamba.name = "May";
        calamba.getVisa();
        calamba.attendClass();
        calamba.code("java");

        CampusStudent campusSt= new CampusStudent();
        campusSt.name = "Wali";
        campusSt.studentID = 123456;
        campusSt.attendClass();
        campusSt.code("python");
        campusSt.playPingPong();
    }
}
