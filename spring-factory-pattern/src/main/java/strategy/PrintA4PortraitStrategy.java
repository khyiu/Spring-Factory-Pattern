package strategy;

public class PrintA4PortraitStrategy implements IPrintStrategy{

	@Override
	public void print() {
		System.out.println("Doing stuff to print an A4 portrait document");
	}

}
