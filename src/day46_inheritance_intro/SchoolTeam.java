package day46_inheritance_intro;

public class SchoolTeam {
    public static void main(String[] args) {
        Person marufjon = new Person();
        marufjon.name = "Marufjon";
        marufjon.age = 22;
        marufjon.gender = 'M';
        //marufjon.course = "Python";ERROR

        Student nadir = new Student();
        nadir.name = "Nadir";
        nadir.age = 25;
        nadir.gender = 'M';
        nadir.course = "SDLC vs STLC";

        marufjon.walk();
        nadir.walk();

        nadir.speak();
        marufjon.speak();

        Employee kiki = new Employee();
        kiki.name = "Kiki";
        kiki.age = 26;
        kiki.gender = 'F';

        kiki.walk();
        kiki.speak();

        kiki.jobTitle = "SDET";

        kiki.work();

       // marufjon.work(); ERROR
       // nadir.work(); ERROR
        marufjon.eat("pasta");
        nadir.eat("shish kabab");
        kiki.eat("farmers salad");


    }
}
