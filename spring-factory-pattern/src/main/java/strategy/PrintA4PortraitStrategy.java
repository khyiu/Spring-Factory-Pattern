package strategy;

import model.Document;

import org.springframework.stereotype.Component;

@Component("A4Portrait")
public class PrintA4PortraitStrategy implements IPrintStrategy{

	@Override
	public void print(Document document) {
		System.out.println("Doing stuff to print an A4 portrait document");
	}

}
