package DesignPatterns.Factory;

import DesignPatterns.Factory.UIComponents.Button.Button;
import DesignPatterns.Factory.UIComponents.Dropdown.Dropdown;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static Platform getPlatform(){
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        String platformName = scanner.nextLine();

        Platform p = PlatformFactory.getPlatform(platformName);
//        object -> object
//        data type -> object

        UIComponentFactory uiComponentFactory = p.createUIComponentFactory();

        Button button = uiComponentFactory.createButton();
        button.click();
        Dropdown dropdown = uiComponentFactory.createDropdown();
        dropdown.show();

    }
}
