package MaxValueInSlidingWindow;

public class MaxValueInWindow
{
    public static void main(String[] args)
    {
        int[] testArray = {-4, 7, -5, 3, 6};
        System.out.println(maxValue(testArray));

    }

    public static int maxValue(int[] array)
    {
        int low = 0;
        int high = 2;
        int max = array[0];

        while (high < array.length)
        {
            for (int i = low; i <= high ; i++)
            {
                for (int j = low + 1; j <= high; j++)
                {
                    if (max <= array[j])
                    {
                        max = array[j];
                    }
                }
            }

            low++;
            high++;

        }
        return max;
    }
}