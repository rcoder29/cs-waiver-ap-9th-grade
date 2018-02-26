package edu.eb.churchill.cswaiver;

import java.util.Random;

// Static class to perform all menu actions outilned in the project specification
public  class MenuActions {

    // Problem # - 1
    // Given tow strings, concatinate with smaller string on both sides of longer string
    // example aa, ccc are two strings then output should be aacccaa
    public static  String comboString(String str1, String str2)
    {
        if (str1 == null || str2 == null)
        {
            System.out.println(" One of the input strings provided is NULL value, so can't concatinate!");
            return new String("");  // return empty string
        }

        // log -- input message
        System.out.println("Input Strings Passsed : ");
        System.out.println("String1 - "+str1);
        System.out.println("String1 - "+str2);

        int len1 = str1.length();
        int len2 = str1.length();

        // find out which string is bigger
        StringBuffer sb = new StringBuffer();

        // find out which string is of smaller in size
        if (len1 > len2)    // str2 is smaller in size
        {
            sb.append(str2);
            sb.append(str1);
            sb.append(str2);
        }
        else // str1 is smaller is size, also covers the case for length being equal!
        {
            sb.append(str1);
            sb.append(str2);
            sb.append(str1);
        }

        // log - final output message
        System.out.println("Final Concatinated string - "+sb.toString());
        return sb.toString();
    }

    // Problem # 2
    public static  boolean nearHunderd(int n) {

        // log
        System.out.println("Input Number provided - "+n);

        // return true if value is between 10 to 100
        if (n >= 10 && n <= 100) {
            System.out.println("near Hundred output - true");
            return true;
        }
        // else false
        else {
            System.out.println("near Hundred output - false");
            return false;
        }
    }


    // Problem # - 3
    public static  int sumDouble(int a, int b)
    {
        System.out.println("Method - sumDouble");
        System.out.println("Input Numbers Provided "+a+" , "+b);

        int finalresult;
        if (a==b)
            finalresult = (a+b)*2;
        else
            finalresult = a+b;

        System.out.println("Output of sum Double - "+finalresult);
        return finalresult;
    }

    // Problem # - 4
    public static  int sumNumbers(int a)
    {
        int totalSum=0;

        // method to sum numbers 1..n
        for (int i = 0; i<= a; ++i)
            totalSum = totalSum + i;

        return totalSum;
    }

    // Problem # - 5
    public static  double getBMI(double height, double weight)
    {
        // BMI formula = weight * 703 / height2
        double bmi;
        bmi = (weight * 703)/(height*height);

        return bmi;
    }

    // Problem # - 6
    public static  double Fahrenheit(double celsius)
    {
        // formula is 9c = 5f - 160
        // also can be written as f = (9c+160)/5
        double fh;
        fh = ((9*celsius)+160)/5;

        return fh;
    }

    // Problem # - 7
    public static  void flipCoin()
    {
        int head = 1;
        int tail = 0;

        for (int i=0; i<20; ++i)
        {
            // get random value between 0 and 1
            int randVal = 0;
            Random rd = new Random();
            int roundVal = rd.nextInt(2);
            randVal = roundVal%2;

            // Print Head/Tail Message
            if (randVal == head)
                System.out.println("Iteration "+i+" value - "+"HEAD");
            else
                System.out.println("Iteration "+i+" value - "+"TAIL");
        }
    }

    // Problem # - 8
    public static  int sumDigits(int a)
    {
        // sum each of digits to return total
        int totalSum=0;
        int numberLeft;
        numberLeft = a;
        while (numberLeft > 0)
        {
            int digit = numberLeft%10;
            totalSum += digit;
            numberLeft = numberLeft/10;
        }

        return totalSum;
    }

    // Problem # - 9
    public static  void thankYouMessage()
    {
        System.out.println("!!! Thank You for Playing with my first Java Program ... Enjoy Coding!!");
    }
}
