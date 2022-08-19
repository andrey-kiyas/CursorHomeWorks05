package HomeWork05.AnnotationConfig;

import org.springframework.stereotype.Component;

@Component
public class MinusService {

    public int calcMinus(int a, int b){
        return a - b;
    }
}