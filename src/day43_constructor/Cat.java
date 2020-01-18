package day43_constructor;

public class Cat {
    private String name;
    //constructor
    public Cat(){
        System.out.println("Cat constructor");
        name = "unknown";//initialize variable
    }
    //constructor to initialize name
    public Cat(String name){
        System.out.println("Cat constructor with name");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
