package designpatterns.structural.bridge.example.vending.menu;

import java.util.List;
import java.util.Scanner;

public abstract class Menu implements MenuElement {

    protected List<MenuElement> subElements;

    public List<MenuElement> getSubElements() {
        return subElements;
    }

    protected MenuElement getInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            return subElements.get(Integer.parseInt(input) - 1);
        } catch (Exception e) {
            System.out.println("Wrong input");
            return getInput();
        }
    }

    public void setSubElements(List<MenuElement> subElements) {
        this.subElements = subElements;
    }

    protected void printSubElements() {
        for (int i = 0; i < subElements.size(); i++) {
            System.out.println((i + 1) + ". " + subElements.get(i));
        }
    }
}
