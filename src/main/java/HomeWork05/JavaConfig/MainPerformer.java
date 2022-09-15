package HomeWork05.JavaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainPerformer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CalculatorConfig.class);
        Calculator calculator = applicationContext.getBean("calculator", Calculator.class);
        calculator.getCalc();
    }
}