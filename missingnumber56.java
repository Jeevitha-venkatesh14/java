import java.util.Scanner;
public class missingnumber56
{
    public static void main(String[] args)
    {
        Scanner jv = new Scanner(System.in);
        System.out.print("Enter n:" );
        int n = jv.nextInt();
        System.out.println("Enter " + (n - 1) + " elements:");
        int[] arr = new int[n-1];
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=jv.nextInt();
        }
        int XOR = 0;
        for(int i = 1;i<=n;i++)
        {
            XOR^=i;
        }
        for(int i =0;i<arr.length;i++)
        {
            XOR^=arr[i];
        }
        System.out.print("missing number: "+ XOR);
    }
}
