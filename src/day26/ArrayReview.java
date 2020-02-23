package day26;

public class ArrayReview {

    public static void main(String[] args) {
        // 1st way
        int[] myNumbers = new int[4];   // 4 is item count
        // we assign value using array variable and it's index
        myNumbers[0] = 10;
        myNumbers[1] = 40;
        myNumbers[2] = 30;
        myNumbers[3] = 7;

        // 2nd way of creating an array
        int[] myNumbers2 = new int[]{10, 40, 30, 7};
        // 3rd way
        // this declaring and assigning value should happen in ONE STATEMENT
        int[] myNumbers3 = {10, 40, 30, 7};


        // how do we get the size of an array
        int size = myNumbers.length; // 4
        int lastIndex = size - 1;  //myNumbers.length-1
       // @@ -59,8 +66,6 @@ public static void main(String[] args) {
            // just change my int array data type to int to avoid issues

            // 1.4 Swap the first item value with last item value



        }

}
