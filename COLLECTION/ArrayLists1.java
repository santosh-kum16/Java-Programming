import java.util.ArrayList;
class ArrayLists1 
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("hi");
		al.add(true);
		al.add(10.2);
		System.out.println(al);
		System.out.println(al.size());
		for (int i=0;i<al.size() ;i++ )
		{
			System.out.println(al.get(i));
		}
	}
}
