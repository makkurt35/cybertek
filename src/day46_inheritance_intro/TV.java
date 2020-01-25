package day46_inheritance_intro;

public class TV extends Device{
    public int screenSize;
    public boolean isSmart;

    public void watch(){
        System.out.println("watching "+brand+" TV with screen " + screenSize+ " and smart " + isSmart );
    }
}
