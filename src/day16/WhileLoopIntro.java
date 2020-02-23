package day16;

public class WhileLoopIntro {
    public static void main(String[] args) {

        //print hello world 5 times
        //also keep the count of  how many times you said hello
        int count = 1;
        System.out.println("Hello World");
        count = count +1;
        System.out.println("Hello World");
        ++ count;
        System.out.println("Hello World");
        ++ count;
        System.out.println("Hello World");
        ++ count;
        System.out.println("Hello World");
        System.out.println("count = " + count);


        System.out.println(".................");
        int cnt = 1;
        while (cnt<= 5){
            System.out.println("Hello World");
            ++cnt;
            System.out.println("cnt = " + cnt);

        }




    }
}
