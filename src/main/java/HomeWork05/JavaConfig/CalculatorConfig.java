package HomeWork05.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:JavaConfig.properties")
public class CalculatorConfig {

    @Bean
    public MinusService minusService() {
        return new MinusService();
    }

    @Bean
    public PlusService plusService() {
        return new PlusService();
    }

    @Bean
    public Calculator calculator() {
        return new Calculator(minusService(), plusService());
    }
}