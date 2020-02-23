package day18;

public class officehour {
    public static void main(String[] args) {
        String item = "Echo dot (3rd Gen) Charcoal";
        //get whatever is inside parenthesis()
        //find out index of (and index in), use them for
        System.out.println(item.substring( 9, 18));
        System.out.println(item.substring( 10, 17));
        
        int indexOfOpenParenthesis = item.indexOf("(");
        int indexOfEndParenthesis = item.indexOf(")");
        
        String wordInsideParenthesis = item.substring(indexOfOpenParenthesis + 1 , indexOfEndParenthesis);
        System.out.println("wordInsideParenthesis = " + wordInsideParenthesis);

        //--------------------------
        String letters = "J%*a^V**$a" ;
        System.out.println("letters = " + letters);
        letters = letters.replace("%",  " " );
        //.              // replace("^", "") // "JaV*****$a"
             //   .replace("*", "") // "JaV$a"
               // .replace("$", "") // "JaVa"
                //.toUpperCase(); // "JAVA"


    }
    
}
