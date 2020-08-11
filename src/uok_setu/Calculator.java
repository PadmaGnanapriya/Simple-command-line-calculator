package uok_setu;

/**
 *
 * @author Padma Gnananpriya - SE/2017/014
 */
public class Calculator {
    private double num1;
    private double num2;
    private double num3;
    private String calOutput;
    private String calOutput2;

    Calculator(double num1, double num2){
        this.num1=num1;
        this.num2=num2;
    }

    public String calculate(String mathOperation){
        switch (mathOperation){
            case "add":num3=num1+num2;break;
            case "sub":num3=num1-num2;break;
            case "div":num3=num1/num2;break;
            case "mul":num3=num1*num2;break;
            default:calOutput="Wrong operation";
        }
        calOutput2= calOutput=="Wrong operation"? calOutput: " Answer = "+num3;
        calOutput=null;
        return calOutput2;
    }
}
