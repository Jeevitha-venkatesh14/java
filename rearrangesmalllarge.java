import java.util.Arrays;
import java.util.Scanner;
public class rearrangesmalllarge
{
    public static void main(String[] args)
    {
        Scanner he = new Scanner(System.in) ;
        System.out.print("Enter the size: ");
        int n = he.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter the element: ");
        for(int i = 0;i<n;i++)
        {
            arr[i]=he.nextInt();
        }
        Arrays.sort(arr);
        int[] result = new int[n];
        int left = 0;
        int right=n-1;
        int index=0;
    while(left<=right)
    {
        if(left==right)
        {
            arr[index++]=arr[left];
        }
        else
        {
            arr[index++]=arr[left++];
            arr[index++]=arr[right--];
        }
    }
    for(int i = 0;i<n;i++)
    {
        System.out.print(result[i]+" ");
    }
}
}
