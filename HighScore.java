import java.util.Scanner;
// Highscore for the given values.
public class HighScore
{
    public static void main(String[] args)
    {
        int n, highest;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of scores to be calculated:");
        //User can insert n number of scores.
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter scores:");

        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        // highest number among all number will be the result from this codes.
        highest = a[0];
        for(int i = 0; i < n; i++)
        {
            if(highest < a[i])
            {
                highest = a[i];
            }
        }
        System.out.println("High score value:"+highest);
    }
}