package strategy;

import model.Document;

import org.springframework.stereotype.Component;

@Component("A4Landscape")
public class PrintA4LandscapeStrategy implements IPrintStrategy{

	@Override
	public void print(Document document) {
		System.out.println("Doing stuff to print an A4 landscape document");
	}

}
