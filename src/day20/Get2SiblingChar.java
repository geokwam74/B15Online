package day20;

import java.util.jar.JarOutputStream;

public class Get2SiblingChar {


    public static void main(String[] args) {
    String name = "Ezra";
        System.out.println( name.substring (0,2));
        System.out.println( name.substring (1,3));
        System.out.println( name.substring (2,4));

        int lastCharIndex  =name.length() -1;
        for (int x = 0; x<=lastCharIndex; x++ ) {
            System.out.println( name.substring( x, x+2));
        }


    }
}
