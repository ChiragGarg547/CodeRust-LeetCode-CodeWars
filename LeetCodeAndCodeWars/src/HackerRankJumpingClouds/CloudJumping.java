package HackerRankJumpingClouds;

public class CloudJumping
{
    public static void main(String[] args)
    {
        int[] c1 = {0,0,0,0,1,0}; // 3
        int[] c2 = {0,1,0,1,0,1}; // 2
        int[] c3 = {0,0,0,1,0,0,0}; // 3
        int[] c4 = {0,0,1,0,0,1,0}; // 4
        int[] c5 = {0,0,0,1,0,0}; // 3
        int[] c6 = {1,0,1,1,0,0,1,0}; // 3

        System.out.println(howManyJumps(c1));
        System.out.println(howManyJumps(c2));
        System.out.println(howManyJumps(c3));
        System.out.println(howManyJumps(c4));
        System.out.println(howManyJumps(c5));
        System.out.println(howManyJumps(c6));





    }

    public static int howManyJumps(int[] c)
    {
        int numOfJumps = 0;
        for (int i = 0; i < c.length; i++)
        {
            if (i + 1 < c.length - 1 && (c[i] == 0 && c[i+1] == 0 && c[i+2] == 0))
            {
                numOfJumps++;
                i++;
            }
            else if (i + 1 < c.length && c[i+1] == 0)
            {
                numOfJumps++;
            }
        }

        return numOfJumps;
    }
}
