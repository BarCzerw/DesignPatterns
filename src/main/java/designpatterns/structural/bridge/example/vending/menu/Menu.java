package designpatterns.structural.bridge.example.vending.menu;

import designpatterns.structural.bridge.example.vending.MenuElement;

import java.util.List;
import java.util.Scanner;

public abstract class Menu implements MenuElement {

    protected List<MenuElement> subElements;

    public List<MenuElement> getSubElements() {
        return subElements;
    }

    protected MenuElement getInput(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            return subElements.get(Integer.parseInt(input));
        } catch (Exception e) {
            System.out.println("Wrong input");
            return getInput();
        }
    }

    protected void printSubElements() {
        subElements.forEach(System.out::println);
    }
}
