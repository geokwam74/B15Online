package day50;

public abstract class Math_Questions {

    int num1;
    int num2;
    String operator;
    int answer;
    boolean calculated;
    String questionType = "Unknown";// setting default value to unknown directly here to avoid null

    public Math_Questions(String operator, String questionType) {
        this.operator = operator;
        this.questionType = questionType;
    }



    public abstract void  calculate();

    @Override
    public String toString(){
        return "The question type is " + questionType;

    }

}
