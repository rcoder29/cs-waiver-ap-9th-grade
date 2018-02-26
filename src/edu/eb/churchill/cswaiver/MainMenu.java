package edu.eb.churchill.cswaiver;

import java.io.Console;

/**
 * Created by RR on 2/19/2018.
 */
public class MainMenu {

    // default constructor
    public void MainMenu() {}

    // Problem # - 0
    public void showMenuOptions()
    {
        System.out.println("===================================");
        System.out.println("Please Select from the Following : ");
        System.out.println("1 - ComboString Function");
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

    // perform action
    private void performMenuAction(int actionSelected, Console c)
    {
        System.out.println("Action selected - "+actionSelected);
        switch(actionSelected) {
            case 1:
                // prompt for new inputs to enter
                System.out.println("Enter Two Input Strings combine - ");
                System.out.print("Enter String1 : ");
                String str1 = c.readLine();
                System.out.print("Enter String2 : ");
                String str2 = c.readLine();
                System.out.println("User Input : string1:" + str1 + " ; string2: "+ str2);
                String comboStr = MenuActions.comboString(str1,str2);
                System.out.println("Combo String - "+comboStr);
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                break;

            case 6:
                break;

            case 7:
                break;

            case 8:
                break;

            case 9:
                // Thank for using the program and return
                MenuActions.thankYouMessage();
                break;

            default:
                System.out.println("Invalid Input Choice - "+actionSelected);
                System.out.println("Select a value between 1 to 9 to perform appropriate action, Please try again ...");
        }
    }


    // main method

    public static void main(String[] args)
    {
        // create instance of class
        MainMenu mainMenu = new MainMenu();

        Console c = System.console();
        if (c == null) {
            System.err.println("No console.");
            System.exit(1);
        }

        // run through an infinite loop until option 9 is selected
        while (true) {

            // display MainMenu
            mainMenu.showMenuOptions();

            // read user input
            String userInput = c.readLine();
            System.out.println("User Input Option - " + userInput);
            int actionSelected = new Integer(userInput).intValue();

            // Perform Action
            mainMenu.performMenuAction(actionSelected,c);

            // exit if selection is option 9
            if(actionSelected == 9)
                break;  // break infinite loop
        }

        // exit program on an option selection that quits the show Options MainMenu!
        System.exit(0);
    }
}
