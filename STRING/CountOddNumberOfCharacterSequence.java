import java.util.Arrays;
import java.util.Scanner;
class CountOddNumberOfCharacterSequence 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.next();
		char ar[]=s.toCharArray();
		Arrays.sort(ar);
		s=new String(ar);
		int oddCount=0;
		while (s.length()>0)
		{
			char c=s.charAt(0);
			int occ=s.lastIndexOf(c+"")+1;
			oddCount+=occ%2;
			s=s.replaceAll(c+"","");
		}
		System.out.println(oddCount);
	}
}
