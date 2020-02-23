package day27;

public class ArrayTask {

    public static void main(String[] args) {

        //Task 02: write a program that can find the minimum number for an array
        //Do not use sort method
        //Task 02: write a program that can find the  second minimum number for an array
        //Do not use sort method

        int[] scores = {100, 345,654,1312,445,7,8,44 ,7,9,2,1 };
        int min =99999999; // min=100
        for (int i = 0; i < scores.length; i++) {
            if (min > scores[i] ) {
                min = scores[i];

            }
        }
        System.out.println("minimum number: " +min);

        int secondMin =scores[0]; // min=100
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == min) {
                continue;

            }
            if (secondMin > scores[i]) {
                secondMin = scores[i];

            }
            System.out.println("Second Minimum number is " + secondMin);
        }
        int thirdMin = scores[0];
        for(int i = 0; i < scores.length; i++){
            if(scores[i] == min || scores[i] ==secondMin){
                continue;
            }
            if(thirdMin >scores[i]){
                thirdMin = scores[i];
            }
        }
        System.out.println("third minimum number is: "+thirdMin);
    }
}




