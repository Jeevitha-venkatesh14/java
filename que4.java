import java.util.Scanner;
public class que4
{
    public static void main(String args[])
    {
        Scanner jv = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = jv.nextInt();
        System.out.print((n/10)%10);
    }
}
