class PrintArrayValuesReferenceCopy 
{
	public static void main(String[] args) 
	{
		//Data assigning in First array
		int array1[]={2,4,6,3,9,5,1};

		int array2[]=array1;	//Reference array1 is assigning to array2 So, new Array is not created rather both reference is pointing same object
		
		System.out.println("Below is Printing First Array data");
		for (int data : array1)
		{
			System.out.print(data+" "); 
		}

		//So, both the array are printing same element
		System.out.println("\nBelow is Printing Second Array data");
		for (int data : array2)
		{
			System.out.print(data+" ");
		}
		System.out.println();
	}
}
