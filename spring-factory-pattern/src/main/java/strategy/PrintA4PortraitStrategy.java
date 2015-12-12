package strategy;

import model.Document;

public class PrintA4PortraitStrategy implements IPrintStrategy{

	public void print(Document document) {
		System.out.println("Doing stuff to print an A4 portrait document");
	}

}
