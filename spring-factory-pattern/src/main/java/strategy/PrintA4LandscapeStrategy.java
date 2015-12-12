package strategy;

import model.Document;

public class PrintA4LandscapeStrategy implements IPrintStrategy{

	public void print(Document document) {
		System.out.println("Doing stuff to print an A4 landscape document");
	}

}
