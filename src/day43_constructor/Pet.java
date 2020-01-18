package day43_constructor;

public class Pet {
    private String type;
    private String name;

    public Pet(){
        System.out.println("Pet no-arg constructor");
    }

    public Pet(String type, String name){
        System.out.println("Pet 2 args constructor");
        this.type = type;
        this.name = name;
    }

    public void speak(){
        System.out.print(name +" is saying ");
       switch (type) {
           case "dog":
               System.out.println("gav gav");
               break;
           case "cat":
               System.out.println("meow meow");
               break;
           case "fish":
               System.out.println("...");
               break;
           case "bird":
               System.out.println("chrek chrek");
               break;
           case "lion":
               System.out.println("rooaarr rooaarr");
               break;
           default:
               System.out.println("java java");
       }
    }

    public void setPetInfo(String type, String name){
        this.type = type;
        this.name = name;
//        this.setType(type); call Setter to set type and name
//        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; //assign name to instance variable name
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public Pet feed(){
//        return this; return same object
//    }

    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
