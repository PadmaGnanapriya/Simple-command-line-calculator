package uok_setu;

import java.math.BigDecimal;

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
            case "sub":num3=(BigDecimal.valueOf(num1).subtract(BigDecimal.valueOf(num2))).doubleValue();break;
            case "div":num3=num1/num2;break;
            case "mul":num3=num1*num2;break;
            default:calOutput="Wrong operation";
        }
        System.out.println(num3);
        String num=(num3- (int)num3)==0? String.valueOf((int)num3):String.valueOf(num3);
        calOutput2= calOutput=="Wrong operation"? calOutput: "\tAnswer = "+num;
        calOutput=null;
        return calOutput2;
    }
}
