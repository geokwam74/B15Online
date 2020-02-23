package arithmeticoperator;

public class maths {
    public static void main(String[] args) {
        System.out.println(5+3);// 8
        System.out.println(5-3);// 2
        System.out.println(5*3);// 15
        System.out.println(5/3);// 1
        // arithmetic operator between two int ----->> another int
        System.out.println( 5+3.0d);//8
        System.out.println(5-3.0d);//2
        System.out.println(5*3.0d);//15
        System.out.println(5/3.0d);//1
        System.out.println(5/3.0f);//1
        //store a phone in variables
        //and  replace above statements with variable instead
        int num1 = 5;
        double num2 = 3.0d;
        float num3 = 3.0f;

        double result1 = num1 + num2;
        double result2 = num1 - num2;
        double result3 = num1 * num2;
        double result4 = num1 / num2;
        float result5 = num1 / num3;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

        //celsius=(5.0/9)* (fahrenheit-3)
        double num6 = (5.0/9);
        double num7 = (-32);
        double results = num6 *num7;
        System.out.println(results);

        double fahrenheit = 78;
        double celsius;
        celsius = (5.0/9) * (fahrenheit -32);
        System.out.println(fahrenheit + "F equals to" + celsius + "C");










    }
}
