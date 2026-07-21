public class array18
{
    public static void main(String[] args)
    {
     int[] arr = {1,2,3,4,6,7};
     int n = arr.length+1;
     int expectedsum = n*(n+1)/2;
     int actualsum = 0;
     for(int i =0;i<arr.length;i++)
     {
         actualsum = actualsum + arr[i];
     }
     int missing = expectedsum - actualsum;
     System.out.print("Missing number = "+ missing);
    }
}
