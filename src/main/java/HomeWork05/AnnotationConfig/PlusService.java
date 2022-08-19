package HomeWork05.AnnotationConfig;

import org.springframework.stereotype.Component;

@Component
public class PlusService {

    public int calcPlus(int a, int b){
        return a + b;
    }
}