package day50;
/*
        * Task 2
        Create an Interface called Drawable
        it has draw method
        Create an abstract class called Shape
        it implements Drawable interface
it has 2 fields :  String name , double area
abstract method calculateArea();
        Create 2 concrete Shape classes called
        Square
        field : length
        instance methods : (implement all abstract methods)
        toString method
        Cirlce
        field : radius
        instance methods : (implement all abstract methods)
        toString method
        * */
// abstract class is not required to implement
// inherited abstract methods of the interface
public class Main {

    public static void main(String[] args) {


        Square s1 = new Square("my precious", 10);
        System.out.println("s1 without area calculation = " + s1);
        s1.calculateArea();
        System.out.println("s1 with area calculation = " + s1);
        s1.draw();


    }

}
