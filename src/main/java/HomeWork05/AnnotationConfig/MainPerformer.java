package HomeWork05.AnnotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPerformer {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AnnotationConfig.xml");
        Calculator calculator = applicationContext.getBean("calculator", Calculator.class);
        calculator.getCalc();
    }
}