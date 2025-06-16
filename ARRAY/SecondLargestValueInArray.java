import java.util.Scanner;
class SecondLargestValueInArray 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int ar[]=new int[scan.nextInt()];
		System.out.println("Enter the value present in array");
		for (int i=0;i<ar.length ;i++ )
		{
			ar[i]=scan.nextInt();
		}
		int large1=Integer.MIN_VALUE;
		int large2=Integer.MIN_VALUE;
		for (int i=0;i<ar.length ;i++ )
		{
			if (ar[i]>large1)
			{
				large2=large1;
				large1=ar[i];
			}
			else if (ar[i]>large2 && large1!=ar[i])
			{
				large2=ar[i];
			}
		}
		System.out.println("Second largest element is: "+large2);
	}
}
