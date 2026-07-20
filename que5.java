import java.util.Scanner;
public class que5
{
    public static void main(String args[])
    {
        Scanner jv = new Scanner(System.in);
        int n1 = jv.nextInt();
        int n2 = jv.nextInt();
        int sum = (n1%10)+(n2%10);
        System.out.print(sum);
    }
}
