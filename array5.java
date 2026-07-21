public class array5
{
    public static void main(String[] args)
    {
        int[] arr = {53,67,85,66,82,24,36};
        int count = 0;
        for(int i =0;i<arr.length;i++)
        {
            if (arr[i] % 2 == 0)
            {
                count++;
            }
        }
            System.out.print("even count = "+ count);
    }
}
