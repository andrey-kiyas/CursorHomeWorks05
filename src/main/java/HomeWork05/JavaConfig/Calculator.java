package HomeWork05.JavaConfig;

import org.springframework.beans.factory.annotation.Value;

public class Calculator {

    public Calculator(MinusService minusService, PlusService plusService) {
    }

    @Value("${calculator.a}")
    private int a;
    @Value("${calculator.b}")
    private int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void getCalc() {
        if (a > b) {
            System.out.println("Calculator (a = " + a + ", b = " + b + "): " + MinusService.calcMinus(getA(), getB()));
        } else {
            System.out.println("Calculator (a = " + a + ", b = " + b + "): " + PlusService.calcPlus(getA(), getB()));
        }
    }
}