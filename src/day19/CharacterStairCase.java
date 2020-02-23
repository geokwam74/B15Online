package day19;

public class CharacterStairCase {
    public static void main(String[] args) {

        String line = "";
        for (char ichar = 'A' ; ichar>='Z'; ichar++) {

            System.out.println( ichar + " " );
            line += ichar;
            System.out.println(line);
        }


    }
}
