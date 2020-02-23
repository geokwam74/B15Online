package day10;

public class Review {
    public static void main(String[] args) {

        //warm up task 1
        //create aclass called Answer with main
        //create a variable called myAnswer as String with value of empty
        //string
        //create a variable called myNumber and assign any value
        // If the number can be divided by 5 without remainder
        //assign myAnswer  value to Fizz Number
        System.out.println("Hello World");

        String myAnswer = "";
        int myNumber =5;
        if( myNumber % 5==0) {
            myAnswer = "Fizz Number";
        }else{
            myAnswer = "not a Fizz Number";

        }
        System.out.println("print my name is" +myNumber + "");


    }
}
