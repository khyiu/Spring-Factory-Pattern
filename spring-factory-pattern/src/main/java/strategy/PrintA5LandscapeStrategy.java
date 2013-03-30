package strategy;

public class PrintA5LandscapeStrategy implements IPrintStrategy{

	@Override
	public void print() {
		System.out.println("Doing stuff to print an A5 landscape document");
	}

}
