package array;

public class Negative_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-2, -3, -1,3,4,2,1};
		int tmp= arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(tmp>arr[i])
			{
				//System.out.println(arr[i]);
				int tmp2=0;
				tmp2=arr[i];
				arr[i]= tmp;
				arr[i-1]= tmp2;
				
				//System.out.println(arr[i]);
			}
		}
		for(int x : arr)
		{
			System.out.print(x+ " ");
		}

	}

}
