package HackerRank2DArray;

public class TwoDArray
{
    public static void main(String[] args)
    {
//        int[] arr = {1,1,1,0,0,0,0,1,0,0,0,0,1,1,1,0,0,0,0,0,2,4,4,0,0,0,2,2,0,0,0,0,1,2,4,0};
        int[] arr = {-9, -9, -9, 1, 1, 1, 0, -9, 0, 4, 3, 2, -9, -9, -9, 1, 2, 3, 0, 0, 8, 6, 6, 0, 0, 0, 0, -2, 0, 0, 0, 0, 1, 2, 4, 0};
        System.out.println(hourglasSum(arr));



    }

    public static int hourglasSum(int[] arr)
    {

        int counter = 0;
        int temp;
        int top;
        int pivot;
        int base;
        int maxSum = 0;
        int curSum;
        for (int outer = 0; outer < 21; outer++)
        {
//            counter++;
            temp = outer;
            top = arr[temp] + arr[++temp] + arr[++temp];
            temp += 5;
            pivot = arr[temp];
            temp += 5;
            base = arr[temp] + arr[++temp] + arr[++temp];
            curSum = top + pivot + base;
            if (maxSum < curSum)
            {
                maxSum = curSum;
            }

            if (counter == 4)
            {
                outer += 2;
                counter = 0;
            }

//            if (outer == 21)
//            {
//                break;
//            }
        }

        return maxSum;
    }
}
