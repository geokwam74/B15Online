package mentor;



import java.util.Scanner;

public class Repl80 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //char startPoint = scan.next().charAt(0);
        char startPoint = scan.next().charAt(0);
        char endPoint = scan.next().charAt(0);

        if (startPoint == endPoint) {
            System.out.println(endPoint + "found");
        }else {
            while (startPoint != endPoint) ;

            if (startPoint == 'A') {
                startPoint = 'B';
                System.out.println("Right");
            } else if (startPoint == 'B') {
            startPoint = 'C';
            System.out.println("Down");
        }else if (startPoint == 'C')  {
                startPoint = 'D';
                System.out.println("left");
            }else if (startPoint == 'D') {
                startPoint = 'A';
                System.out.println("UP");
                if (startPoint != endPoint) ;
                System.out.println("> ");
            }else {
                System.out.println("endPoint = " + "found");








            }

        }

    }
}
