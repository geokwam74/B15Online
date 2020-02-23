package day23;

import java.util.Arrays;

public class ArraysEquality {

    public static void main(String[] args) {
        int[] scores1 = {2,5,6,7,3,34,6};
        int[] scores2 = {22,45,6,37,3,6,9};
        int[] scores3 = {2,5,6,7,3,34,6};
        int[] scores4 = {6,5,6,7,3,34,2};

        System.out.println(scores1 == scores2);
        System.out.println(scores1 == scores3);

        boolean isS1S2Equals = Arrays.equals(scores1,scores2);
        System.out.println("is scores1 has same content as scores2 = " + isS1S2Equals);

        boolean isS1S3Equals = Arrays.equals(scores1,scores3);
        System.out.println("is scores1 has same content as scores3 = " + isS1S3Equals);

        boolean isS3S4Equals = Arrays.equals(scores3,scores4);
        System.out.println("is scores3 has same content as scores4 = " + isS3S4Equals);
        System.out.println("Sorting");
    }
}
