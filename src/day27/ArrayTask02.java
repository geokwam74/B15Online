package day27;

import java.util.Arrays;

public class ArrayTask02 {


    public static void main(String[] args) {

        int[] scores = {100, -99, -1000, 2000, 5000 , 0, 1, 2000};
        int min = scores[0];     // min: 32


        int[] Nums = {100,10000,9999,8888,1213,2345};
        int max = Nums[0];
        for (int x = 0; x < Nums.length; x++ ) {
            if(max < Nums[x] ) {
                max = Nums[x];

            }
        }
        System.out.println("First max number" +max);


        int secondMin = scores[0];

        int secondMax = Nums[0];
        for (int x = 0; x < Nums.length; x++ ) {
            if (max < Nums[x]) {
                max = Nums[x];
                if (secondMax < Nums[x] && Nums[x] != max) {
                    secondMax = Nums[x];
                }
                System.out.println("second max number: "+secondMax);
            }

            int thirdMin = scores[x];
            for(int i = 0; i < scores.length; i++){
            /*
            if(scores[i] == min || scores[i] ==secondMin){
                continue;
            }
             */
                if(thirdMin >scores[i] && scores[i] != min && scores[i] !=secondMin){
                    thirdMin = scores[i];
                }
            }
            System.out.println("third minimum number is: "+thirdMin);
        }
    }

}


