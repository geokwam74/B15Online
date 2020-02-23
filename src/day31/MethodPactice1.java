package day31;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MethodPactice1 {

    //write a piece of reusable code to count from 1 to 10
    //give a name of count1to10
    //no need for object when being called


    public static void count1to10(){


        for(int i = 1; i<=10; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

     //DOES NOT MATTER
    public static void main(String[] args) {

        count1to10();
        System.out.println();
        count1to10();
        //optionally you can call using classname.methodName();
        MethodPractice1.count1to10();









        }
    }

