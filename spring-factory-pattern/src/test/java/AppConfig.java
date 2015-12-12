import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import strategy.*;

public class AppConfig {

    @Bean(name = "printStrategyFactory")
    public ServiceLocatorFactoryBean printStrategyFactory() {
        ServiceLocatorFactoryBean locatorFactoryBean = new ServiceLocatorFactoryBean();
        locatorFactoryBean.setServiceLocatorInterface(PrintStrategyFactory.class);
        return locatorFactoryBean;
    }

    @Bean(name = {"A4Landscape", "A4L", "DEFAULT"})
    public IPrintStrategy printA4LandscapeStrategy() {
        return new PrintA4LandscapeStrategy();
    }

    @Bean(name = {"A4Portrait", "A4P"})
    public IPrintStrategy printA4PortraitStrategy() {
        return new PrintA4PortraitStrategy();
    }

    @Bean(name = {"A5Landscape", "A5L"})
    public IPrintStrategy printA5LandscapeStrategy() {
        return new PrintA5LandscapeStrategy();
    }

    @Bean(name = {"A5Portrait", "A5P"})
    public IPrintStrategy printA5PortraitStrategy() {
        return new PrintA5PortraitStrategy();
    }
}
