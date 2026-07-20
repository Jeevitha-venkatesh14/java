import java.util.Scanner;
public class que8
{
    public static void main(String args[])
    {
        Scanner jv = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 5; i++)
        {
            int num = jv.nextInt();
            if (num % 2 == 0)
                count++;
        }
            System.out.print(count);
    }
    }