package day13;

public class NameInUpperLowerCases {
    public static void main(String[] args) {

        String s1 = "George";
        System.out.println( s1.equals ("123"));
        System.out.println( s1.equalsIgnoreCase("George"));

        System.out.println(  s1);
        System.out.println(  s1.toUpperCase());
        System.out.println(  s1.toLowerCase());

        System.out.println(  s1.length()   );
        int lengthOfStr = s1.length();

        if (lengthOfStr > 4) {
            System.out.println("More than 4 character");

        }else{
            System.out.println();
        }




    }
}
