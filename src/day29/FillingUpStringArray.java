package day29;

import java.util.Arrays;

public class FillingUpStringArray {

    public static void main(String[] args) {

        //create an array with size 300 and fill it up with I Love Java

        String[] strArr = new String[300];
        System.out.println("Before filling strArr = " + Arrays.toString(strArr) );
        strArr[0] = " I Love Java ";
        strArr[1] = " I Love Java ";
        strArr[2] = " I Love Java ";

        for (int i = 0; i < strArr.length; i++)  {
            strArr[i] = " I Love Java";
            strArr[i] = (i+1) + " .I Love Java";
            System.out.println("strArr = " + Arrays.toString(strArr) );

            String str  = new String("ABC");
            String[] strArr2 = new String[5];

            strArr2[0] = " I LOVE JAVA " ;
            strArr2[1] = " I LOVE JAVA " ;
            strArr2[2] = " I LOVE JAVA " ;
            strArr2[3] = " I LOVE JAVA " ;
            strArr2[4] = " I LOVE JAVA " ;

            System.out.println("strArr2 = " + Arrays.toString(strArr2) );

        }



    }
}
