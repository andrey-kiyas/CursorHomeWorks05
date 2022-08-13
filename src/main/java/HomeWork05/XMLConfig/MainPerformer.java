package HomeWork05.XMLConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPerformer {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("XMLConfig.xml");
        Calculator calculator = context.getBean("calculator", Calculator.class);

        calculator.getCalc();
        context.close();
    }
}