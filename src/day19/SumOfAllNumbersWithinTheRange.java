package day19;

public class SumOfAllNumbersWithinTheRange {
    public static void main(String[] args) {

        //get the sum of numbers from 1 - 10
        //nothing have been added yet so 0
 //        sum = sum + 1 //1
        // sum= sum + 2 //3
        // sum= sum + 3 //6
        // sum= sum + 4 //10
        // sum= sum + 5 //15
        // sum= sum + 6 //21
        // sum= sum + 7 //28
        // sum= sum + 8 //36
        // sum= sum + 9 //45
        // sum= sum + 10 //55
        int sum = 0;
        for ( int i = 1; i<=10; i++) {
            sum = sum +i;
           // System.out.println(sum);
        }
        System.out.println();

    }
}
