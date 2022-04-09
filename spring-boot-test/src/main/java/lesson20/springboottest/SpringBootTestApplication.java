package lesson20.springboottest;

import lesson20.springboottest.service.Calculator;
import lesson20.springboottest.service.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootTestApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringBootTestApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext contex  = SpringApplication.run(SpringBootTestApplication.class, args);
		Calculator calculator = contex.getBean(Calculator.class);
		log.info("{} + {} = {}", 1, 2, calculator.calculate(1,2, Operation.PLUS));
		log.info("{} - {} = {}", 1, 2, calculator.calculate(1,2, Operation.MINUS));
		log.info("{} / {} = {}", 3, 2, calculator.calculate(3,2, Operation.DIVIDE));
		log.info("{} * {} = {}", 1, 2, calculator.calculate(1,2, Operation.MULTIPLY));
		//System.out.println(calculator.calculate(1,2, Operation.MINUS));
	}


}
