package day50_inheritance_hiding;

public class Engine {
    private String name;
    private int horsePower;
    private int cylinders;

    public Engine(String name, int horsePower, int cylinders) {
        this.name = name;
        this.horsePower = horsePower;
        this.cylinders = cylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", horsePower=" + horsePower +
                ", cylinders=" + cylinders +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}
