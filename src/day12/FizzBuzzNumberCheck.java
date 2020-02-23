package day12;

public class FizzBuzzNumberCheck {
    public static void main(String[] args) {

        int num =45;
        if (num % 5==0 ) {
            System.out.println("Fizz Number");
        }else if ( num % 3==0 ){
            System.out.println("Buzz Number");
        }else if ( num % 3==0 && num % 5==0 ){
            System.out.println("FizzBuzz Number");
        }else {
            System.out.println(" Not My Number");





        }
    }
}
