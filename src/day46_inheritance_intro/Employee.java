package day46_inheritance_intro;

import day46_inheritance_intro.Person;
//EMPLOYEE IS-A PERSON
public class Employee extends Person {
    public String jobTitle;

    public void work(){
        System.out.println(name +" is working hard as "+jobTitle);
    }

}
