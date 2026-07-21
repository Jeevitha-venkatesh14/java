package practice_java1;
import java.util.Arrays;
public class thirdlargestarray 
{
	static int getthirdlargest(int[] arr)
	{
		int n = arr.length;
		Arrays.sort(arr);
		return arr[n-3];
	}
	public static void main(String[] args)
	{
	int[] arr = { 1,14,2,16,10,20};	
	System.out.println(getthirdlargest(arr));

	}

}
