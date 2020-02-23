package day10;

public class Calculator_Ver1 {
    /*
        // Create a class Calculator with main
        create a variable called operator with type char
        Assign the value for one of these 4 : + - * /
        char operator = ‘+’ ;
        use switch statement  to do following logic
        if the operator is +   print you are about to add numbers
        if the operator is -   print you are about to subtract numbers
        if the operator is *   print you are about to multiply numbers
        if the operator is /   print you are about to divide numbers
        If nothing match print invalid operator
        USE switch statement to complete this task
        */

    public static void main(String[] args) {

        int num1 = 120;
        int num2 = 10;
        char operator = '/';
        switch (operator) {

            case '+':
                System.out.println( num1+num2);
                break;
            case '-':
                System.out.println( num1 - num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("invalid operator!!!!!");
                break;




        }
    }
}
