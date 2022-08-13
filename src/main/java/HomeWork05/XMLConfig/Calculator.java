package HomeWork05.XMLConfig;

public class Calculator {

    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void getCalc() {
        if (a > b) {
            System.out.println("Calculator (a = " + a + ", b = " + b + "): " + MinusService.calcMinus(getA(), getB()));
        } else {
            System.out.println("Calculator (a = " + a + ", b = " + b + "): " + PlusService.calcPlus(getA(), getB()));
        }
    }
}