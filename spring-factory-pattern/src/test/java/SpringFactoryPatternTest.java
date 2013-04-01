import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import strategy.PrintStrategyFactory;


@ContextConfiguration(locations = {"classpath:/spring-config.xml"})
public class SpringFactoryPatternTest extends AbstractTestNGSpringContextTests{
	
	@Autowired
	private PrintStrategyFactory printStrategyFactory;
	
	@Test
	public void printStrategyFactoryTest(){
		printStrategyFactory.getStrategy("DEFAULT").print();
		printStrategyFactory.getStrategy("A5L").print();
		printStrategyFactory.getStrategy("A5P").print();
		printStrategyFactory.getStrategy("A5Portrait").print();
	}
}
