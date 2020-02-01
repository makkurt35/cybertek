package day50_inheritance_hiding;

public class City extends Object{
    private String name;
    public int count;

    public City() {
        name = "undefined";
    }
                    //Paris
    public City(String name) {
        this.name = name;
    }

    public void letsBuildARoad(){
        System.out.println("City - lets build a road");
        buildARoad();
    }

    public static void buildARoad(){
        System.out.println("City - building a road...");
    }

    @Override
    public String toString(){
       return "name = "+name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
