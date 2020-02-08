package day54_polymorhism;

public class Triangle extends Shape{
    public Triangle(){
        type = "triangle";
    }

    @Override
    public void draw() {
        for (int i = 0; i < 5; i++) {
            for (int j = 5 - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
