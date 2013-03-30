package strategy;

public class PrintA4LandscapeStrategy implements IPrintStrategy{

	@Override
	public void print() {
		System.out.println("Doing stuff to print an A4 landscape document");
	}

}
