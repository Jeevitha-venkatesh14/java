package practice_java1;
import java.util.Arrays;
public class anagramjava 
{
	public static void main(String[] args) 
	{
	String s1 = "listen";
	String s2 = "silent";
	char[] a1 = s1.toCharArray();
	char[] a2 = s2.toCharArray();
	Arrays.sort(a1);
	Arrays.sort(a2);
	if(Arrays.equals(a1,a2))
	{
		System.out.print("anagram");
	}
	else
	{
		System.out.print("not anagram");
	}
	}
}
