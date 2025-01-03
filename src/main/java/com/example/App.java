package com.example;

public class App {


    public static void main(String[] args) {
        UserInterface roadUserInterface = createUserInterface("RED");
        UserInterface mountainUserInterface = createUserInterface("BLUE");
        UserInterface blackUserInterface = createUserInterface("BLACK");

        System.out.println(roadUserInterface);
        System.out.println(mountainUserInterface);
        System.out.println(blackUserInterface);

    }


    private static UserInterface createUserInterface(String color) {
        UserInterfaceFactory factory = FactoryMaker.getUserInterfaceFactory(color);
        Button button = factory.createButton();
        ScrollBar scrollBar = factory.createScrollBar();
        return new UserInterface(button, scrollBar);
    }

}

