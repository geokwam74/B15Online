package day29;

import java.util.Arrays;

public class FillingUpArrayValueEvenNumber {

    public static void main(String[] args) {
        //create an int array with the size 100 and fill it up as below
        //fill up this array with number from 1 to 100
        //\n will move it to next line

        int[] numbers = new int[100];

        System.out.println(" Before filling up \n" + Arrays.toString(numbers));
      /*  numbers[0] = 0;     //0*2
        numbers[1] = 2;     //1*2
        numbers[2] = 4;    //2*2
        numbers[3] = 6;    //3*2
        numbers[4] = 8;    //4*2
        numbers[5] = 10;   //5*2
        //........
        numbers[99] = 198; //99*2

       */

        //numbers[x] = x * 2

        System.out.println(" After filling up \n" + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;

            System.out.println(" After filling up \n" + Arrays.toString(numbers));


        }


    }
}
