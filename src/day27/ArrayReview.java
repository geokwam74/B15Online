package day27;

import day24.Task1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReview {

    /* Array is a variable that allows us to store multiple values declaration
    regular variable we can only store one single value ex. int a = 10;
    array variables:
    int[] arr = {1,2,3};
    index        0 1 2 --> the index # can help us to retrieve data

     retrieve data:
     arraryName[ indexNumber] ==> element of that index #

     Array must be converted to string in order to be printed
     Array's size is fixed, must be initialized before we use it




     */


    public static void main(String[] args) {
        int num = 10;
        int[] arr = {10,20, 30, 40, 50, 60 };
        //length: returns the the total number of elements from the array
        //last index num : arr.length -1
        int num1 = arr[arr.length -1];
        //                6 - 1 =  5
        System.out.println(num1);
        System.out.println("==============================");
        //expected : 10 20 30 40 50 60
        for (int x = 0; x< arr.length; x++) {
            System.out.println(arr[x]);
        }
        System.out.println("\n============================");

        //Arrays.toString(variableName):
        String str = Arrays.toString(arr);
        System.out.println(str);

        //Task01: write a program that asks user to enter a number 5 times, and store those num into array
        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));
        Scanner scan = new Scanner(System.in); //returns int data type

        for (int i=0; i<5; i++) {
            System.out.println("Enter an int Number");
            int input = scan.nextInt();
            numbers[i] = input;

            System.out.println(Arrays.toString(numbers) );
            //Arrays.sort (variableName): sort the array in ascending order
            Arrays.sort(numbers);
            int largestNumber = numbers[numbers.length - 1];
            System.out.println("largest number is " + largestNumber);
           int minimumNumber = numbers[0];
            System.out.println("Minium number is " + minimumNumber);



        }


    }
}
