package strategy;

public interface PrintStrategyFactory {
	
	IPrintStrategy getStrategy(String strategyName);
}
