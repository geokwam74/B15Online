package day17;

public class NamePrinter_WhileLoop {
    public static void main(String[] args) {

        String name = "Cybertek School Java Program";
        // get each and every character and print them out vertically
        int x =0 ;
        while (x<name.length() ) { //(x<=name.length() -1)
            System.out.print("index  " + x + " ");
            System.out.println(name.charAt(x) );
            ++x;
        }

    }
}
