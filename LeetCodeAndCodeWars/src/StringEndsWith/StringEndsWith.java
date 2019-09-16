package StringEndsWith;

public class StringEndsWith
{
    public static void main(String[] args)
    {
        System.out.println(solution("abc", "bc"));
        System.out.println(solution2("abc", "bc"));


    }

    public static boolean solution(String str, String ending) {

        if (ending.length() > str.length())
        {
            return false;
        }

        String substring = str.substring(str.length() - ending.length());
        return substring.equals(ending);
    }

    public static boolean solution2(String str, String ending)
    {
        return str.endsWith(ending);
    }
}
