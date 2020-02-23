package day17;

public class WhileLoopPractice {
    public static void main(String[] args) {

        //count 1 to 5 then 5to 1
        //if I use (counter <=5) as condition I will
        //
        int counter = 1;
        while (counter<=5) {
            System.out.print(counter + " ");
            ++counter;
        }
        System.out.println();
        System.out.println("counter = " + counter);

        while (counter>=1) {
            --counter;
            System.out.print(counter + " ");

            while (counter>1) {

            }
                --counter;
                System.out.print(counter + " ");

                while (counter<=1){
                    --counter;
                    System.out.print(counter + " ");

                }
                  System.out.println();
            System.out.println("counter after drcrement = " + counter);
        }


    }
}
