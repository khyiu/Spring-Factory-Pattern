import model.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;
import strategy.PrintStrategyFactory;


public class SpringFactoryPatternTest {
	
	@Test
	public void printStrategyFactoryTest(){
		Document doc = new Document();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PrintStrategyFactory printStrategyFactory = context.getBean(PrintStrategyFactory.class);
		printStrategyFactory.getStrategy("DEFAULT").print(doc);
		printStrategyFactory.getStrategy("A5L").print(doc);
		printStrategyFactory.getStrategy("A5P").print(doc);
		printStrategyFactory.getStrategy("A5Portrait").print(doc);
	}
}
