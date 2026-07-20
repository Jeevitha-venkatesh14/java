import java.util.Scanner;
public class que9
{
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
     int oddcount=0;
     for(int i =0;i<5;i++)
     {
         int num = sc.nextInt();
         if(num%2!=0)

             oddcount++;
     }
     System.out.print(oddcount);
    }
}
