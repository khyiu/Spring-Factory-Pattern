package strategy;

import org.springframework.stereotype.Component;

@Component("A5Landscape")
public class PrintA5LandscapeStrategy implements IPrintStrategy{

	@Override
	public void print() {
		System.out.println("Doing stuff to print an A5 landscape document");
	}

}
