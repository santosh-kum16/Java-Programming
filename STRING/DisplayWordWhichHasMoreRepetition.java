import java.util.*;
class DisplayWordWhichHasMoreRepetition 
{
	public static void main(String[] args) 
	{
		String s = "cat ball bat batsman CAT cat bat Cat batsman";
		String strAr[]=s.split(" ");
		//Arrays.sort(strAr);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i=0;i<strAr.length ;i++ )
		{
			if (map.containsKey(strAr[i]))
			{
				int val=map.get(strAr[i]);
				int newVal=val+1;
				map.put(strAr[i],newVal);
			}
			else
				map.put(strAr[i],1);
		}
		System.out.println(map);
	}
}
