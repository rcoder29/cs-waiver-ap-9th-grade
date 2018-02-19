package edu.eb.churchill.cswaiver;

/**
 * Created by RR on 2/19/2018.
 */
public class Numbers {

    public void NumberRange() {}

    // Problem # 2
    public boolean nearHunderd(int n) {

        // log
        System.out.println("Input Number provided - "+n);

        // return true if value is between 10 to 100
        if (n >= 10 && n <+ 100) {
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
    public int sumDouble(int a, int b)
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


    // Main method
    public static void main(String[] args)
    {
        // create instance of class
        Numbers nr = new Numbers();

        // problem 2
        nr.nearHunderd(5);
        nr.nearHunderd(90);
        nr.nearHunderd(67);
        nr.nearHunderd(2000);
        nr.nearHunderd(1);

        // problem 3
        nr.sumDouble(1,1);
        nr.sumDouble(1,100);
        nr.sumDouble(10,20);
        nr.sumDouble(-5,-5);
    }
}
