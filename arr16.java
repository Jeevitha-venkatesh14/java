public class arr16
{
    public static void main(String[] args)
        {
            int[] arr = {0,5,0,0};
            int nz =0;
            for(int i = 0; i<arr.length;i++)
            {
                if (arr[i] != 0)
                {
                    arr[nz] = arr[i];
                    nz++;
                }
            }
                for(int i =nz ; i<arr.length;i++)
                {
                    arr[i]=0;
                }
                for(int i = 0;i<arr.length;i++)
                {
                    System.out.print(arr[i]+ " ");
                }
        }
    }

