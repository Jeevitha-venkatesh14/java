import java.util.Scanner;
public class array2
{
    public static void main(String[] args)
    {
        int[] arr = {12,34,56,77,99};
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
             System.out.println(arr[i]);
        }
    }
}
