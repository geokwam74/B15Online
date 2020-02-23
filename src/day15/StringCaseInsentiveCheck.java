package day15;

public class StringCaseInsentiveCheck {
    public static void main(String[] args) {
        String name = "Arya Stark";
        System.out.println(  name.contains( "st") );
        String uppercaseName = name.toUpperCase() ;
        System.out.println( "uppercaseName contains ST or not ? " + uppercaseName.contains("ST"));

        String lowercaseName = name.toLowerCase() ;
        System.out.println("lowercaseName contains st or not = " + lowercaseName.contains("st"));


        name.toLowerCase().contains("st");
        System.out.println( name.toLowerCase().contains("st")   );
    }


}
