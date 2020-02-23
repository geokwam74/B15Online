package day24;

public class ForEachLoopReadOnly {

    public static void main(String[] args) {

        int yourFavName = 300 ;
        int myFavNumber = yourFavName ;

        myFavNumber = 299 ;
        System.out.println(yourFavName);

        long[] nums = {10, 40, 20 };
      //  nums[x] = nums[] * 2;
        System.out.println(nums[0]);

        for (int x =0; x < 3; x++ ) {
            long eachItem = nums[x];
            eachItem = 100;
            System.out.println("AFTER WE MODIFY THE VALUE");
            for (int y =0; x < 3; y++ ) {
                System.out.println(nums[x]);

            }
        }
    }
}
