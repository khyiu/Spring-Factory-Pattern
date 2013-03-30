package strategy;

public class PrintA5PortraitStrategy implements IPrintStrategy{

	@Override
	public void print() {
		System.out.println("Doing stuff to print an A5 portrait document");
	}

}
