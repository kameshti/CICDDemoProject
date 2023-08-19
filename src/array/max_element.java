package array;

public class max_element {

	public static void main(String[] args)
	{
		int arr[]= {10,20,40,30};
		int len= arr.length;
		int max=arr[0];
		
		for(int i=0; i<len;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		System.out.print(max);
		

	}

}
