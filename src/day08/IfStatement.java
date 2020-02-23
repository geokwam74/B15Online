package day08;

public class IfStatement {
    public static void main(String[] args) {

        int speedLimit = 60;
        int yourCurrentSpeed = 145;
        // if the yourCurrentSpeed is more than speed limit
        // get pulled over by the police
        // given ticket by the police
        // taken away some points on your license
        // go to court
        boolean IamSpeeding =  yourCurrentSpeed > speedLimit ;

        // INSIDE PERENTHESIS WE CAN ONLY PUT
        // BOOLEAN VALUE  : ture false
        // BOOLEAN VARIABLE
        // ANY EXPRESSION THAT RETURN BOOLEAN VALUE
        //if( IamSpeading ) {
        // if( true ) {

        if ( IamSpeeding )  {
            System.out.println("get pulled over by the police");
            System.out.println("given ticket by the police");
            System.out.println("taken away some points on my license");
            System.out.println("go to court");
        }else  {
            System.out.println("go shopping");
            System.out.println("buy IceCream");
            System.out.println("Enjoy your day");
        }
        System.out.println("THE END");


    }
}
