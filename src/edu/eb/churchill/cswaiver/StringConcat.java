package edu.eb.churchill.cswaiver;

/**
 * Created by RR on 2/19/2018.
 */
public class StringConcat {

    // Given tow strings, concatinate with smaller string on both sides of longer string
    // example aa, ccc are two strings then output should be aacccaa
    private String StringAttach(String str1, String str2)
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

    public static void main(String[] args)
    {
        // create Class
        StringConcat myobj = new StringConcat();

        // run the method with different inputs!
        myobj.StringAttach("dog", "cat");
        myobj.StringAttach("cat", "dogs");
        myobj.StringAttach("bars", "foo");
        myobj.StringAttach("aaa", "");
    }
}
