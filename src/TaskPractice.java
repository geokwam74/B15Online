import java.util.Scanner;

public class TaskPractice {


    public static void main(String[] args) {
        /*Write a program that can print out the unique values from an int Array
        Ex:
        if arr -> {1,1,2,3,3}
        output: 2


         */

        //                  0 1 2 3 4
        int[] uniqueValues = new int[]{1, 1, 2, 3, 3};
        uniqueValues[0] = 1;
        uniqueValues[1] = 1;
        uniqueValues[2] = 2;
        uniqueValues[3] = 3;
        uniqueValues[4] = 3;
        System.out.println(uniqueValues[2]);


    }

   // public static void main(String[] args) {
        //Do not change
        String word = new Scanner(System.in).nextLine();

        //Write Your code here


   //     System.out.print("Today's Word-Of-The-Day is:");

    }

