public class array7
{
    public static void main(String[] args)
    {
        int[] arr = {53,67,85,66,82,24,36};
        int max = arr[0];
        for(int i =1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.print("Maximum = " + max);
    }
}
