package day31;

public class MethodIntro {
    public static void main(String[] args) {

        //TWO WAY TO CALL STATIC METHODS
        //ClassName.methodName(external data if needed
        //if you are in same class


        System.out.println("Hello World");
        System.out.println("My name is George");
        System.out.println("I Love Java");

        MethodIntro.sayHello();
        System.out.println("Begin");
        sayHello();
        System.out.println("-----------------");
        sayHello();
        System.out.println("The End");


    }//MAIN METHOD ENDS HERE !!!!!!
    //DO NOT CREATE A METHOD INSIDE MAIN METHOD
    public static void sayHello() {

    }
}
