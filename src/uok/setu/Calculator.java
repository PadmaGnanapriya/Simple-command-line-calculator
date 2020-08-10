package uok.setu;

public class Calculator {
    double num1;
    double num2;
    double num3;
    String calOutput,calOutput2;

    Calculator(double num1, double num2){
        this.num1=num1;
        this.num2=num2;
    }

    public String calculate(String mathOperation){
        switch (mathOperation){
            case "sum":num3=num1+num2;break;
            case "sub":num3=num1-num2;break;
            case "div":num3=num1/num2;break;
            case "multy":num3=num1*num2;break;
            default:calOutput="Wrong operation";
        }
        calOutput2= calOutput=="Wrong operation"? calOutput: " Answer = "+num3;
        calOutput=null;
        return calOutput2;
    }
}
//