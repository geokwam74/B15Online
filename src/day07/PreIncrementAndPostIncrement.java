package day07;

public class PreIncrementAndPostIncrement {
    public static void main(String[] args) {

        //increment
        int apple= 8;
        apple ++ ; //incrementing by 1
        System.out.println( apple); //print the increase value

        //System.out.println( apple++ ); //increasing the value  and print the value
        //apple ++, when ++ comes after the variable
        //it's called past increment
        //it will increase the value
        // But it will reflect the increased the variable show up!!

        System.out.println( apple++ );
        System.out.println( apple );

        int score = 50;
        System.out.println(++score); //51
        System.out.println(score++); //51 and ready to increase to 52 next time it shows up
        System.out.println(score); //52

        System.out.println( --score); //51
        System.out.println( score --);//still 51 ready to be 50 next time it shows up
        System.out.println(score);//50





    }
}
