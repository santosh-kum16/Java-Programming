import java.util.Scanner;
class OperationsOnString 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String s=scan.nextLine();
		int si=0,ei=0;
		
		//Copying of starting index of String where first character found except space
		for (int i=0;i<s.length() ;i++ )
		{
			if (s.charAt(i)!=' ')
			{
				si=i;
				break;
			}
		}

		//Copying of ending of String index where first character found except space
		for (int i=s.length()-1;i>=0 ;i-- )
		{
			if (s.charAt(i)!=' ')
			{
				ei=i;
				break;
			}
		}
		
		//Concating string with trim functionality
		String t="";
		for (int i=si;i<=ei ;i++ )
		{
			t=t+s.charAt(i);
		}
		s=t;
		
		//Removing extra spaces in between words
		String e="";
		for (int i=0;i<s.length()-1 ;i++ )
		{
			if ((s.charAt(i)==' ' && s.charAt(i+1)==' '))
			{
			}
			else
				e=e+s.charAt(i);

		}
		e=e+s.charAt(s.length()-1);

		//Removing space before full stop of string
		String last="";
		if (e.charAt(e.length()-1)=='.')
		{
			for (int i=0;i<e.length()-2 ;i++ )
			{
				last=last+e.charAt(i);
			}
			last=last+e.charAt(e.length()-1);
		}
		System.out.println(last);
		
	}
}
