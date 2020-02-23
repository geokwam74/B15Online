package day17;

public class ReversePrintString {
    public static void main(String[] args) {
        //get your name printed in a revserved order
        //assuming we dont know the length
        //find out the location of the last character of your name
        //pick your last character of your name according to the location
        //then keep shifting the location to pick until first character


        String name = "George Sarpong-Barnor";
        int lastCharacterIndex = name.length() -1;
        while (lastCharacterIndex >=0) {
            System.out.println("lastCharacterIndex = " + lastCharacterIndex + name.charAt(lastCharacterIndex));
            --lastCharacterIndex;
        }


    }
}
