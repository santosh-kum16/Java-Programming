class ArrayInitials 
{
	public static void main(String[] args) 
	{
		//Ways to declare and Initialising an Array

		// 1st Way
		int array[] = new int[3];

		//2nd Way
		int array1[];
		array1 = new int[3];

		//3rd way
		int array2[] = {3,44,20,97,54};



		//Assigning the values in Array
		array1[0] = 33;
		array1[1] = 18;

		//Print values from Array
		System.out.println("Values of Array elements are: ");
		for(int i=0; i<array2.length; i++)
		{
			System.out.println(array2[i]);
		}
	}
}
