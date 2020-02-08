package day54_polymorhism;

import java.util.ArrayList;
import java.util.List;

public class InstanceOf {
    public static void main(String[] args) {
        Shape diamond = new Diamond();
        System.out.println(diamond.getClass().getSimpleName());

        Shape shape = new Square();
        System.out.println("shape is referring to object of "+shape.getClass().getSimpleName());

        if(shape.getClass().getSimpleName().equals("Square")){
            System.out.println("It is object of Square class");
        }

        //instance of operator
        if (shape instanceof Square){
            System.out.println("Square object");
        } else if (shape instanceof Diamond){
            System.out.println("Diamond object");
        }

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Shape());
        shapeList.add(new Square());
        shapeList.add(new Square());
        shapeList.add(new Diamond());
        shapeList.add(new Triangle());
        shapeList.add(new Shape());
        shapeList.add(new Square());
        shapeList.add(new Square());
        shapeList.add(new Diamond());
        shapeList.add(new Triangle());
        shapeList.add(new Shape());
        shapeList.add(new Square());
        shapeList.add(new Square());
        shapeList.add(new Diamond());
        shapeList.add(new Triangle());
        shapeList.add(new Shape());
        shapeList.add(new Square());
        shapeList.add(new Square());
        shapeList.add(new Diamond());
        shapeList.add(new Triangle());

        int shapeCount, triangleCount, squareCount, diamondCount;
        shapeCount=triangleCount=squareCount=diamondCount=0;

        for (Shape eachShape : shapeList) {
            if (eachShape instanceof Triangle){
                triangleCount++;
            }else if (eachShape instanceof Diamond){
                diamondCount++;
            }else if (eachShape instanceof Square){
                squareCount++;
            }else if (eachShape instanceof Shape){
                shapeCount++;
            }
        }

        for (Shape eachShape : shapeList) {
            if (eachShape.getClass().getSimpleName().equals("Triangle")){
                triangleCount++;
            }else if (eachShape.getClass().getSimpleName().equals("Diamond")){
                diamondCount++;
            }else if (eachShape.getClass().getSimpleName().equals("Square")){
                squareCount++;
            }else if (eachShape.getClass().getSimpleName().equals("Shape")){
                shapeCount++;
            }
        }

        System.out.println("shapeCount = " + shapeCount);
        System.out.println("triangleCount = " + triangleCount);
        System.out.println("squareCount = " + squareCount);
        System.out.println("diamondCount = " + diamondCount);

    }
}
