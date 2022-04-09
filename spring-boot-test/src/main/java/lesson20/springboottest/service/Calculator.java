package lesson20.springboottest.service;

import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class Calculator {

    private final Collection<Processor> processors;

    public Calculator(Collection<Processor> processors) {
        this.processors = processors;
    }

    public int calculate(int a, int b, Operation operation){
        return processors.stream()
                .filter(p ->p.getOperation() == operation )
                .findAny()
                .orElseThrow(()-> new RuntimeException("unknow operation"))
                .process( a,  b);



    }
}
