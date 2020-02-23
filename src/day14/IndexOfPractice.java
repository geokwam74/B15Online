package day14;

public class IndexOfPractice {
    public static void main(String[] args) {

        //indexOf

        String name = "Game of Java";
        System.out.println( name.indexOf("Java"));

        System.out.println( name.indexOf("Find out the location of Java"));
        System.out.println( name.indexOf("o"));
        System.out.println( name.indexOf("Find out the location of o"));
        System.out.println( name.indexOf("Find out the location of O"));
        System.out.println( name.indexOf("O"));
        System.out.println( name.indexOf("Find out the location of a"));
        System.out.println( name.indexOf("a"));

        System.out.println( name.indexOf("Find out the location of the first space"));
        System.out.println( name.indexOf(" "));
    }
}
