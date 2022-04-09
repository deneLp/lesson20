package lesson20.springboottest.service.processor;

import lesson20.springboottest.service.Operation;
import lesson20.springboottest.service.Processor;
import org.springframework.stereotype.Component;

@Component
public class DivideProcessor implements Processor {
    @Override
    public Operation getOperation() {
        return Operation.DIVIDE;
    }

    @Override
    public int process(int a, int b) {
        return a/b;
    }
}
