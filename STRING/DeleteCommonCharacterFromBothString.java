import java.util.Scanner;
class DeleteCommonCharacterFromBothString 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First String:");
		String s1=scan.next();
		System.out.println("Enter Second String:");
		String s2=scan.next();

		StringBuilder sb1 = new StringBuilder(s1);
		StringBuilder sb2 = new StringBuilder(s2);

		for (int i=0;i<sb1.length() ;i++ )
		{
			for (int j=0;j<sb2.length() ;j++ )
			{
				if(sb1.charAt(i)==sb2.charAt(j))
				{
					sb1.deleteCharAt(i);
					sb2.deleteCharAt(j);
				}
			}
		}
		System.out.println(sb1);
		System.out.println(sb2);
	}
}
