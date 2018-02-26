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
        String str1, str2;
        int inputNumber1, inputNumber2;
        switch(actionSelected) {
            case 1:
                // prompt for new inputs to enter
                System.out.println("Enter Two Input Strings combine - ");
                System.out.print("Enter String1 : ");
                str1 = c.readLine();
                System.out.print("Enter String2 : ");
                str2 = c.readLine();
                System.out.println("User Input : string1:" + str1 + " ; string2: "+ str2);
                String comboStr = MenuActions.comboString(str1,str2);
                System.out.println("Combo String - "+comboStr);
                break;

            case 2:
                // prompt for new inputs to enter
                System.out.println("Enter Input Number for Near Hundred check - ");
                System.out.print("Enter Input Number : ");
                str1 = c.readLine();
                inputNumber1 = new Integer(str1).intValue();
                MenuActions.nearHunderd(inputNumber1);
                break;

            case 3:
                // prompt for new inputs to enter
                System.out.println("Enter Two Input Numbers for sumDouble - ");
                System.out.print("Enter Value1 : ");
                str1 = c.readLine();
                System.out.print("Enter Value2 : ");
                str2 = c.readLine();
                inputNumber1 = new Integer(str1).intValue();
                inputNumber2= new Integer(str1).intValue();
                int sumDoubleVal = MenuActions.sumDouble(inputNumber1, inputNumber2);
                System.out.println("User Input : Number1:" + str1 + " ; Number2: "+ str2);
                System.out.println("Sum Double - "+sumDoubleVal);
                break;

            case 4:
                // sumNumbers
                // prompt for new inputs to enter
                System.out.println("Enter Input for sumNumbers - ");
                System.out.print("Enter Value : ");
                str1 = c.readLine();
                inputNumber1 = new Integer(str1).intValue();
                int sumNumbersVal = MenuActions.sumNumbers(inputNumber1);
                System.out.println("User Input : Number:" + str1);
                System.out.println("Sum Numbers - "+sumNumbersVal);
                break;

            case 5:
                //getBMI
                System.out.println("Enter Two Input Numbers for sumDouble - ");
                System.out.print("Enter Height : ");
                str1 = c.readLine();
                System.out.print("Enter Weight : ");
                str2 = c.readLine();
                double height = new Double(str1).doubleValue();
                double weight = new Double(str1).doubleValue();
                double bmi = MenuActions.getBMI(height, weight);
                System.out.println("User Input : Height:" + str1 + " ; Weight: "+ str2);
                System.out.println("BMI - "+bmi);
                break;

            case 6:
                //Fahrenheit
                // prompt for new inputs to enter
                System.out.println("Enter Input for sumNumbers - ");
                System.out.print("Enter Value : ");
                str1 = c.readLine();
                double celcius = new Double(str1).doubleValue();
                double fahrenheit = MenuActions.Fahrenheit(celcius);
                System.out.println("Fahrenheit Output :"+fahrenheit);
                break;

            case 7:
                //flipCoin
                MenuActions.flipCoin();
                break;

            case 8:
                //sumDigits
                // prompt for new inputs to enter
                System.out.println("Enter Input for sumDigits - ");
                System.out.print("Enter Value : ");
                str1 = c.readLine();
                inputNumber1 = new Integer(str1).intValue();
                int sumDigitsVal = MenuActions.sumDigits(inputNumber1);
                System.out.println("User Input : Number:" + str1);
                System.out.println("Sum Digits Output - "+sumDigitsVal);
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
