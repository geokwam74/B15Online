package day21;

public class ArrayTask {
    public static void main(String[] args) {

        char[] myNameChar = new char[6];
        myNameChar[0] = 'G';
        myNameChar[1] = 'E';
        myNameChar[2] = 'O';
        myNameChar[3] = 'R';
        myNameChar[4] = 'G';
        myNameChar[5] = 'E';
        System.out.print( myNameChar [0]);
        System.out.print( myNameChar [1]);
        System.out.print( myNameChar [2]);
        System.out.print( myNameChar [3]);
        System.out.print( myNameChar [4]);
        System.out.print( myNameChar [5]);

        System.out.println();
        for ( int i = 0; i < 6; i++) {
            System.out.print(myNameChar [i] );
        }

        char[] myNameChar2 = new char[] {'S','a','r','p','o','g'};
        for ( int i = 0; i < myNameChar2.length; i++) {
            System.out.println( myNameChar2[i] + " " );
        }
        char[] myNameChar3 =  {'S','a','r','p','o','g'};
        int count = myNameChar3.length;
        System.out.println("item in last index : " + myNameChar3[count-1] );
        int midIndex = count/2 ;
        System.out.println("item in mid index : " + myNameChar3[midIndex]);

        System.out.print( myNameChar3 [6]);
        System.out.print( myNameChar3 [5]);
        System.out.print( myNameChar3 [4]);
        System.out.print( myNameChar3 [3]);
        System.out.print( myNameChar3 [2]);
        System.out.print( myNameChar3 [1]);
        System.out.print( myNameChar3 [0]);

    }
}
