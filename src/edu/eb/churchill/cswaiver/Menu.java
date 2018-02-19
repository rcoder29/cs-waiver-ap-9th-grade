package edu.eb.churchill.cswaiver;

import java.io.Console;

/**
 * Created by RR on 2/19/2018.
 */
public class Menu {

    // constructor
    public void Menu()
    {
        // default constructor
    }

    // Problem # - 0
    public void showMenuOptions()
    {
        System.out.println("===================================");
        System.out.println("Please Select from the Following : ");
        System.out.println("1 - Perform Action 1");
        System.out.println("2 - Perform Action 2");
        System.out.println("3 - Perform Action 3");
        System.out.println("4 - Perform Action 4");
        System.out.println("5 - Perform Action 5");
        System.out.println("6 - Perform Action 6");
        System.out.println("7 - Perform Action 7");
        System.out.println("8 - Perform Action 8");
        System.out.println("9 - Perform Action 9");
        System.out.println("===================================");
    }


    // main method
    public static void main(String[] args)
    {
        // create instance of class
        Menu menu = new Menu();

        Console c = System.console();
        if (c == null) {
            System.err.println("No console.");
            System.exit(1);
        }

        // display Menu
        menu.showMenuOptions();

        // read user input
        String userInput = c.readLine();
        System.out.println("User Input Option - "+userInput);

        // exit program on an option selection that quits the show Options Menu!
    }
}
