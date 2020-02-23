package day31;

import java.util.Arrays;

public class OfficeHour1 {

    public static void main(String[] args) {
        //Task1: write a program that can check if a string is build out of the same letters as another string
        //		Ex: input:
        //				str1 = "abc";
        //				str2 = "cba";
        String str1 = "abc", str2 = "cbb";

        char[] ar1 = str1.toCharArray();
        Arrays.sort(ar1);
        char[] ar2 = str2.toCharArray();//[c, b, b]
        Arrays.sort(ar2);//[b, b, c]

        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));

        str1 = Arrays.toString(ar1);
        str2 = Arrays.toString(ar2);

        System.out.println(str1.equals(str2));

        //Task2: Write a program that will remove all the duplicates from a string
        //				Do it with Arrays only

        String s1 = "aaabbaaccbbdd";//expected result : abcd
        String s2 = "";//we store non duplicated characters in it

        int i;
        for (i= 0; i < s1.length(); i++) {
            String eachChar = ""+ s1.charAt(i);//b
            if (!s2.contains(eachChar)) {
                s2 += eachChar;//we only concat the character if that
                //s2: "a"

            }

        }

        System.out.println(s2);

        //Solution 2
        String fiveMin = "abcabc";
        String[] EachChar = fiveMin.split("");
        String result = ""; //to store all non duplicated String objects of the array

        for (String each :EachChar ) {
            if (!result.contains(each)){
                result += each;

            }

        }

        System.out.println(result);




    }
}
