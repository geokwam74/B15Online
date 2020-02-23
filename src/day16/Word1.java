package day16;

public class Word1 {
    public static void main(String[] args) {
        String word1 = "Java ";
        String word2 = "  ";


        //in other to reverse a word, we need to take last character in
         word2 = "" + word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0);
        System.out.println("word2 = " + word2);
        word2  += word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0);
        System.out.println("word2 = " + word2);

        word2 = word2 + word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0);
        System.out.println("word2 = " + word2);





    }
}
