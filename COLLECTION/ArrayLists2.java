import java.util.ArrayList;
class ArrayLists2 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		for (int i=0;i<al.size() ;i++ )
		{
			System.out.println((int)al.get(i)+2);
		}
	}
}
