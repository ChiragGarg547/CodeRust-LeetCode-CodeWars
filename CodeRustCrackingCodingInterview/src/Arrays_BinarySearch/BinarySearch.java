package Arrays_BinarySearch;

public class BinarySearch
{
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,4,7,8,12,15,19,24,50,69,80,100};
        System.out.println("Key(12) found at: "+ bSearch(arr1,12));
        System.out.println("Key(44) found at: "+ bSearch(arr1,44));
        System.out.println("Key(80) found at: "+ bSearch(arr1,80));

    }

    public static int bSearch(int[] sortedArray, int key)
    {
        int low = sortedArray[0];
        int high = sortedArray.length - 1;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;

            if (sortedArray[mid] == key)
            {
                return mid;
            }

            if (key < sortedArray[mid])
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        return -1;
    }
}
