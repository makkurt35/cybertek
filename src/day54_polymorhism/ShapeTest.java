package day54_polymorhism;


public class ShapeTest {
    public static void main(String[] args) {
       Shape shape = new Shape();
       Square square = new Square();
       Triangle triangle = new Triangle();
       Diamond diamond = new Diamond();

       shape.draw();
       square.draw();
       triangle.draw();
       diamond.draw();

       //POLYMORPHISM: reference type is parent class or interface
        //object type is sub class
        System.out.println("---- POLYMORPHISM ---");
        Shape shape1 ;
        shape1 = new Square();
        shape1.draw();

        shape1 = new Triangle();
        shape1.draw();

        shape1 = new Diamond();
        shape1.draw();

        System.out.println("--- CALL DRAW WITHOUT VARIABLE---");
        new Triangle().draw();
        new Diamond().draw();
        new Square().draw();

        System.out.println("java".toUpperCase());

        //=======create 4 shapes, using polymorphism
        Object shapeObj = new Shape();
        Shape square1 = new Square();
        Shape triangle1 = new Triangle();
        Shape diamond1 = new Diamond();

        //Diamond dm = new Shape(); ERROR ,
        // cannot put child reference to parent type object
        square1.draw();
        triangle1.draw();
        diamond1.draw();

        //square1.squareMethod();
        //DOWNCASTING: cast reference type to object type
        //DOWNCASTING: cast reference from parent type to child type
        //Shape square1 = new Square();
        //after casting as if: Square square1 = new Square();
        ((Square)square1).squareMethod();
        square.squareMethod();

    }
}
