package array;

public class reverse_array {
	public static void main(String[] args)
	{
		int arr[]= {10,20,30,40};
		int len= arr.length;
		int arr1[]= new int[arr.length];
		for(int i=0; i<len;i++)
		{
			arr1[len-i-1]= arr[i];
			
		}
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr1[i] + " ");
		}

	}

}
