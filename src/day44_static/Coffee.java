package day44_static;

public class Coffee {
    private String name;
    private String size;
    private double price;

    public Coffee(String name, String size, double price) {
        this.name = name;
        this.setSize(size);
        this.price = price;
    }

    public Coffee(){
        this.name = "undecided";
        this.size = "notsure";
        this.price = 0.0;
    }

    public void drink(){
        System.out.println("Drinking " + size + " " + name + " for $" + price);
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }
    //tall, grande, venti
    public void setSize(String size) {
        if(size.equals("tall") | size.equals("grande") | size.equals("venti")) {
            this.size = size;
        }else{
            System.out.println("ERROR: Invalid size - " + size);
            this.size = "unknown";
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
