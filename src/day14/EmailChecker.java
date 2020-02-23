package day14;

public class EmailChecker {
    public static void main(String[] args) {

        String email = "geokwam@ yahoo.com";
        System.out.println("email");


        if (  ! email.contains("@") || email.contains("")) {
            System.out.println(" Invalid email");

        }else if ( email.endsWith("@gmail.com") )  {
            System.out.println("Google mail" );
        }else if ( email.endsWith("@yahoo.com") )  {
            System.out.println("Yahoo mail" );
        }else if ( email.endsWith("@mail.ru") )  {
            System.out.println("Russian mail" );

        }
    }
}
