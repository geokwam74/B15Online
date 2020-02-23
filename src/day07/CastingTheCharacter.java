package day07;

public class CastingTheCharacter {
    public static void main(String[] args) {

        //char to int conversion happen implictly
        //cahr aChar = 'a';
        //int n = aChar;
        //int n = 100
        //char dChar = (char) a;
        char grade = 'B' ;
        System.out.println(grade);
        int letterInNumber = 'B';
        System.out.println(letterInNumber);
        int letterInNumber2 = 'b';
        System.out.println( letterInNumber);
        //--------------------------
        char myFirstChar = (char) 100;
        System.out.println(myFirstChar);
       int myFirstName = 'G';
        int myFirstName1 = 'E';
        int myFirstName2 = 'O';
        int myFirstName3 = 'R';
        int myFirstName4 = 'G';
        int  myFirstName5 = 'E';

        //System.out.println(myFirstName,myFirstName1,myFirstName2,myFirstName3,myFirstName4,myFirstName5,);
        System.out.println(myFirstName);
        System.out.println(myFirstName1);
        System.out.println(myFirstName2);
        System.out.println(myFirstName3);
        System.out.println(myFirstName4);
        System.out.println(myFirstName5);

        System.out.println("=======================");


        // saving the number as char
        // so we can get the character representation
        // of the number in ascii table
        char my1stChar = (char) 100;
        System.out.println(myFirstChar);

        // find out your number of each character in your first name
        // this is implicitly turning 'A' to it's number representation in ascii table

        int firstCharNum = 'A'; // you may also write it as  int firstCharNum = (int)'A' ;
        System.out.println("number of letter A is " + firstCharNum);

        // or OPTIONALLY you can directly cast it to number and print
        System.out.println("number of letter K is " + (int) 'K');


        char letterA = 'a';
        //  adding a character to a int number will result in int
        //  (int) letterA   + 1
        System.out.println(letterA + 1);

        System.out.println(" " + letterA + 1);


    }


}


