package StringIncrementer;

public class Solution
{
    public static String incrementString(String string)
    {
        String incrementedString = "";



//        String pattern = "(^[^\\d].*)(.*\\d$)";

        String[] splitString = (string.split("(?<=\\D)(?=\\d)"));
        for (String string1: splitString)
        {
            System.out.println(string1);
        }

        splitString[1] += 1;
        System.out.println(splitString[1]);

//        if (string.matches("(^[^\\d].*)(.*\\d$)"))
//        {
//            System.out.println();
//            System.out.println(string + " has a digit at the end");
//        }
//        else
//        {
//            string += "1";
//        }

        return string;
    }
}
