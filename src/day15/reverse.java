package day15;

public class reverse {
    public static void main(String[] args) {
        String name = "George";
        System.out.println( name.charAt(5) );
        System.out.println( name.charAt(4));
        System.out.println( name.charAt(3));
        System.out.println( name.charAt(2));
        System.out.println(name.charAt(1) );
        System.out.println( name.charAt(0));

        int nameLength = name.length();
        int characterCount = name.length();
        int lastCharIndex = characterCount -1;
        char lastChar = name.charAt(lastCharIndex);
        System.out.println( "LAST CHAR IS" + lastChar);
        System.out.println( "last char in on  shot " + name.charAt(name.length() -1) );
    }
}
