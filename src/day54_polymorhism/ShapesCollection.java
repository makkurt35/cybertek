package day54_polymorhism;

import java.util.*;

public class ShapesCollection {
    public static void main(String[] args) {
        //declare array that can store 2 squares
        Square[] squaresArr = new Square[2];
        squaresArr[0] = new Square();
        squaresArr[1] = new Square();

        squaresArr[0].draw();
        squaresArr[1].draw();

        //Shape array with polymorphism
        Shape[] shapesArr = new Shape[4];
        //shapesArr[0].draw(); Nullpointer exception
        shapesArr[0] = new Shape();
        shapesArr[1] = new Square();
        shapesArr[2] = new Triangle();
        shapesArr[3] = new Diamond();

        //draw each shape using for loop
        for (int i = 0; i < shapesArr.length; i++) {
            shapesArr[i].draw();
        }

        //draw each shape using for each loop
        for (Shape shape : shapesArr){
            shape.draw();
        }
        System.out.println("---- ARRAYLIST ----");

        List<Triangle> trList = new ArrayList<>();
        trList.add(new Triangle());
        trList.add(new Triangle());

        trList.get(0).draw();
        trList.get(1).draw();

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Shape());
        shapeList.add(new Square());
        shapeList.add(new Square());
        shapeList.add(new Diamond());
        shapeList.add(new Triangle());

        for (int i = 0; i < shapeList.size(); i++) {
            shapeList.get(i).draw();
        }

        for (Shape eachShape : shapeList){
            eachShape.draw();
        }



    }
}
