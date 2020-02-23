package escape;

import java.util.Scanner;

public class GiveMe5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Give Me 5");
        int userNumber = scan.nextInt();

        if( userNumber !=5){
            System.out.println("HEY YOU DID NOT GIVE ME 5!!!" );

        }
        System.out.println("END OF PROGRAM");
    }
}
