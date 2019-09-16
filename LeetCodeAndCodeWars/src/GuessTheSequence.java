import java.util.Arrays;

public class GuessTheSequence
{
    public static void main(String[] args)
    {
       System.out.println(Arrays.toString(sequence(6)));

    }

    public static int[] sequence(int x)
    {
        int[] guessedSequence = new int[x];
        for (int i = 0; i < x; i++)
        {
            guessedSequence[i] = i + 1;
        }

        return guessedSequence;
    }
}
