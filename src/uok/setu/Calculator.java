package uok.setu;

public class Calculator {
    private double num1;
    private double num2;
    private double num3;
    private String calOutput;
    private String calOutput2;

    Calculator(double num1, double num2){
        this.setNum1(num1);
        this.setNum2(num2);
    }

    public String calculate(String mathOperation){
        switch (mathOperation){
            case "sum":
                setNum3(getNum1() + getNum2());break;
            case "sub":
                setNum3(getNum1() - getNum2());break;
            case "div":
                setNum3(getNum1() / getNum2());break;
            case "multy":
                setNum3(getNum1() * getNum2());break;
            default:
                setCalOutput("Wrong operation");
        }
        setCalOutput2(getCalOutput() =="Wrong operation"? getCalOutput() : " Answer = "+ getNum3());
        setCalOutput(null);
        return getCalOutput2();
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum3() {
        return num3;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }

    public String getCalOutput() {
        return calOutput;
    }

    public void setCalOutput(String calOutput) {
        this.calOutput = calOutput;
    }

    public String getCalOutput2() {
        return calOutput2;
    }

    public void setCalOutput2(String calOutput2) {
        this.calOutput2 = calOutput2;
    }
}
//