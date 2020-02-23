package day07;

public class Casting {
    public static void main(String[] args) {

        //types of Casting
        //Casting is converting one type to another Implicity and Explicity

        /* Types in Java
        Primitive types
        boolean
        character
        <btye<

         */
        //implicitly
       // int i = 10;
        //Long b = a;
        //explictly
        // long a = 10L;
        //int b = a ; this wiill not work because the big cup cannot fit into the small cup.
        //but this will work
        //int b = (int) a ;

       // int num = 10;
        //int 10 is implicitly (automatically) converted to double 10.0

        double bigNum = 10;
        System.out.println(bigNum);
        //12.99 is double, double has much bigger range than int.
        //so it just does not fit
        // int num = 12.99;// compiler error!!!
        int num = (int) 12.99;
        System.out.println(num);

        //create a long variable and store int
        //create an int
        long earthToMoon = 10000 ; //---->10000L
        //create an int variable and try to store above long Value
        int earthToMoonIn_int = (int) earthToMoon;
        System.out.println(earthToMoon);


    }
}
