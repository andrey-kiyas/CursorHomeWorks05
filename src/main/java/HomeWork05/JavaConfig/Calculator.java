package HomeWork05.JavaConfig;

import org.springframework.beans.factory.annotation.Value;

public class Calculator {
    private final MinusService minusService;
    private final PlusService plusService;

    public Calculator(MinusService minusService, PlusService plusService) {
        this.minusService = minusService;
        this.plusService = plusService;
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
            System.out.println("Calculator (a = " + a + ", b = " + b + "): " + minusService.calcMinus(getA(), getB()));
        } else {
            System.out.println("Calculator (a = " + a + ", b = " + b + "): " + plusService.calcPlus(getA(), getB()));
        }
    }
}