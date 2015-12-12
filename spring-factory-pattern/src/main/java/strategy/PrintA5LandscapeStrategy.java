package strategy;

import model.Document;

public class PrintA5LandscapeStrategy implements IPrintStrategy {

    public void print(Document document) {
        System.out.println("Doing stuff to print an A5 landscape document");
    }

}
