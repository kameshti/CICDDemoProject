package array;

public class kth_max_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find 5th max and 2th min value 
		int arr[]= {9,8,2,4,3,6,5,7,1};
		int len=arr.length;
				int tmp;
		for(int i=0;i<len;i++)
		{
			tmp=arr[i];
			for(int j=i+1;j<len;j++)
			{
				//System.out.println(arr[i]);
				if(arr[j]<tmp)
				{
					tmp=arr[j];
					arr[j]=arr[i];
					arr[i]=tmp;
					
				}
			}
			
		}
		for(int x : arr)
		{
			System.out.println(x);
		}
		System.out.println("5th max number "+ arr[len-5] +" 2nd min number "+ arr[1]);
		

	}

}
