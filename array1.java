public class array1
{
    public static void main(String[] args)
    {
        int[] arr = {12,45,38,9,69,34,63};
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]%2==0) {
                System.out.println(arr[i]);
            }
        }
    }
}
