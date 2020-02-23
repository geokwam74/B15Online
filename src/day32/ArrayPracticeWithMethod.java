package day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {

    public static void main(String[] args) {
        arrayPractice(new int[]{1, 6, 5, 3, 12, 3});

        int[] scores = {2, 5, 8, 23, 4, 5, 6};
        arrayPractice(scores);
        printMinOfIntArray(scores);
      //  compare2arraySizes();

    }
    //arrayPractice
    //create a method that has one int array as a parameter
    //print out each item in this format
    //array has items : --------->> all the times here

    public static void arrayPractice(int[] nums) {

        System.out.println("arrays has items: " + Arrays.toString(nums));
    }
    //printMaxOfIntArray
    // this method has one int array as parameter
    //and it will print the max number inside the array


    //    printMinOfIntArray
    //this method has one int array as parameter
    // and it will print the min number inside the array
    public static void printMinOfIntArray(int[] nums) {
        int min = nums[0];
        for (int x = 0; x < nums.length; x++) {
            if (min < nums[x]) {
                min = nums[x];

            }


            //    printSumOfIntArray
            //// this method has one int array as parameter
            //    //and it will print the sum number inside the array

      //   public static void printSumOfIntArray(int[] num){
                int sum = 0;
                for (int each : nums) {

                }

            }

            //    OPTIONALLY
            // checkScoresAllMoreThan60
            // this method has one int array as parameter
        }
     //  public static void printMinOfIntArray(int[] nums1 ) {
      //      int max = nums1[0];
        //    for (int x = 0; x < nums1.length; x++) {
          //      if (max < nums1[x]) {
            //        max = nums1[x];




        //    System.out.println("max =" + max);



        public static void compare2arraySizes(String arr1, String arr2){
    //    if (arr1.length >arr2.length ) {

        }

        }





