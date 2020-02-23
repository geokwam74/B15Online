package day29;

import java.util.Arrays;

public class FillingUpArrayValueOddNumber {


    public static void main(String[] args) {
        //create an int array with the size 100 and fill it up as below
        //fill up this array with number from 1 to 100
        //\n will move it to next line

        int[] numbers = new int[100];

        System.out.println(" Before filling up \n" + Arrays.toString(numbers));
      /*  numbers[0] = 0;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;
        numbers[5] = 11;

       */
        //numbers[x] = x * 2

        System.out.println(" Before filling up \n" + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i *2)+1;


            System.out.println(" After filling up \n" + Arrays.toString(numbers));

        }

        }
}
