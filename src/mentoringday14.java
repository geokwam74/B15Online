import java.util.Scanner;

public class mentoringday14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter age :");
        int age =scan.nextInt();
        if (age<2) {
            System.out.println( "ineligible");

        }
        else if ( age>=2&&age<3) {
            System.out.println("toddler");

        }
        else if ( age>=3&&age<6){
            System.out.println("early childhood");
        }
        else if ( age>=6&&age<8) {
            System.out.println("young reader");
        }
        else if ( age>=8&&age<11) {
            System.out.println("elementary");
        }
        else if ( age>=11&&age<13) {
            System.out.println("middle");
        }
        else if ( age>=13&&age<14) {
            System.out.println("impossible");
        }
        else if ( age>=14&&age<17) {
            System.out.println("high school");

        }
        else if ( age>=17&&age<18) {
            System.out.println("scholar");
        }
        else if ( age>=18) {
            System.out.println("ineligible");
        }
    }
}
