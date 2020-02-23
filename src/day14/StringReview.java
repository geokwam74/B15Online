package day14;

public class StringReview {
    public static void main(String[] args) {

        String str = "Pumpkin";
        System.out.println(str.equals("I like Pumpkins"));
        System.out.println("str" + str);

        //contains
        //it checke whether a string exists in another string

        System.out.println("Does it contains Pumpkin: ");
        System.out.println(str.contains("Pumpkins"));

        boolean gotPumpkin = str.contains("Pumpkin");
        System.out.println("gotPumpkin = " + gotPumpkin);

        boolean startedWithI = str.startsWith("");
        System.out.println("startedWithI = " + startedWithI);
        boolean endWithPumpkin = str.endsWith("Pumpkin");
        System.out.println("end With Pumpkin = " + endWithPumpkin);

        //password Validator
        //Minimum 8 char max 16 char
        // It must contains_ or $
        //It must contains space
        //It must contains Ab
        // if any of the above condition does not match say INVALID PASSWORD
        //else say GOOD PASSWORD

        String password = "Windfallmaker";
        //Minimum 8 Char Max 16
        boolean min8max16 = password.length() >=8 && password.length() <=16;
        //password.length() >=8 && password.length() <=16
        //It must contain space

        // password.contains(" ")
        boolean mustContainsSpace = ! password.contains("");
        //It must contain _or$
        boolean mustContains_or$ = password.contains("");

        //IT must start Ab
        //password.startWith("Ab ")
        boolean mustStartWithAb = password.startsWith("Ab");


        if (min8max16 && mustContains_or$ && mustContainsSpace && mustStartWithAb){
        System.out.println("Valid Password");
    }else{
            System.out.println("InValid Password");
        }







    }
}
