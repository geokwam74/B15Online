package day16;

public class IndexOfParameter {
    public static void main(String[] args) {
        String name = "I love Java Java Java Java";
        //get the second java from the sentence
        //assume you already know where there is 4 java in this sentence
        //
        System.out.println("Java starting from  0" +  name.indexOf(  "Java"));
        System.out.println("Java starting from  7" +  name.indexOf( "Java ", 7) );
        System.out.println("Java starting from  8" +  name.indexOf( "Java",  8));
        System.out.println( "Java starting from 9" +  name.indexOf(  "Java",  9));
        System.out.println("Java starting from  19" +  name.indexOf("Java",  19));
        System.out.println("Java starting from  20" +  name.indexOf("Java",  20));
        int firstJavaLocation = name.indexOf("Java");
        int startingPointToSearchSecondJava = firstJavaLocation + 1;
        int secondJavaLocation = name.indexOf("Java" , startingPointToSearchSecondJava);
        System.out.println("second Java Location = " + secondJavaLocation);
        int firstSpace = name.indexOf("");
        int secondSpace = name.indexOf("" , firstSpace + 1);
        System.out.println("second word in this sentence " + name.substring(firstJavaLocation + 1, secondJavaLocation));




    }
}
