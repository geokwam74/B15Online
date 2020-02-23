package day50;

public class Addition extends Math_Questions {

    public Addition(int num1 , int num2){
        // int num1;
//    int num2;
//    String operator;
//    int answer;
//    boolean calculated;
//    String questionType = "Unknown";


        super("+" ,"addition question");
        this.num1 = num1;
        this.num2 = num2;

    }

    @Override
    public void calculate() {

        // if you come to this point it means you called
        // the calculate method to calculate the result
        answer = num1 + num2;
        calculated = true;

    }
    @Override
    public String toString() {

        if (calculated == true) {
            return super.toString() + num1 + operator + num2 + " = " + answer;
        }else {
            return super.toString()+  num1 + operator + num2 + " = " ;


        }
    }
}
