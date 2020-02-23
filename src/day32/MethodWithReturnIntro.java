package day32;

public class MethodWithReturnIntro {

    public static void main(String[] args) {

        String name =giveMeMyName();
        System.out.println("name =" +name);

        int myResult = doubleTheNumber(10);
        System.out.println("myResult = " + myResult);

        System.out.println("result of doubling 100 is " + doubleTheNumber(100));


    }


    //doubleTheNumber
    public static int doubleTheNumber( int num) {
        System.out.println("I am going to double the value of " +num);
        int result = num *2;
        return result;


    }

    public static String giveMeMyName () {

        return "George";

    }


}

