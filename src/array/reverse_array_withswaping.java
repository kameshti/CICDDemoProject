package array;

public class reverse_array_withswaping 
{

	public static void main(String[] args)
	{
		int arr[]= {10,20,30,40};
		int len= arr.length;
		int tmp;
		
		for(int i=0; i<len/2;i++)
		{
			tmp=arr[i];
			 arr[i]=arr[len-i-1];
			 arr[len-i-1]=tmp;
			
		}
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}

	}
}
