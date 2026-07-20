import java.util.Scanner;
public class que1
{
    public static void main(String args[])
    {
        Scanner jv = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = jv.nextInt();
        if(n%2==0)
        {
            System.out.print("Even number");
        }
    }
}
