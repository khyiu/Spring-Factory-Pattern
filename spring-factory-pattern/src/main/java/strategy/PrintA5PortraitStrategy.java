package strategy;

import model.Document;

public class PrintA5PortraitStrategy implements IPrintStrategy {

    public void print(Document document) {
        System.out.println("Doing stuff to print an A5 portrait document");
    }

}
