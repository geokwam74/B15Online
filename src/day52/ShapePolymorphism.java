package day52;

import day50.Circle;
import day50.Shape;


public class ShapePolymorphism {

    public static void main(String[] args) {
      //  Circle s1 = new Circle("penny",5);
       Shape s1 = new Circle("penny",5);
     //   Object s1 = new Circle("penny", 5);
        //Drawable s1 = new Circle("penny",5);

        //ONLY THE REFERENCE TYPE DECIDE WHAT YOU CAN ACCESS WITH THAT VARIABLE
     //   s1.draw();
     //   s1.draw();
            printAnyShapeArea(s1);
           // Shape s2 = new Rectangle(10,5);

        System.out.println(s1.toString());

        //How do I known what is the actual object type
        System.out.println(s1.getClass().getSimpleName() );
    }

    //Create a method that accept any Shape and print out the calculated area

    public static void printAnyShapeArea(Shape anyShape){
        anyShape.calculateArea();
      //  System.out.println(anyShape.area);

    }



}
