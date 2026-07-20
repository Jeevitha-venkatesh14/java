import java.util.Scanner;
public class removeduplicate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size: ");
        int n = sc.nextInt();
        System.out.print("enter the elements:");
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int visited = -1;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] != visited)
            {
                for (int j = i + 1; j < arr.length; j++)
                {
                if(arr[i]==arr[j])
                {
                    arr[j]=visited;
                }
                }
                System.out.print(arr[i]+" ");
            }
        }
    }
}
