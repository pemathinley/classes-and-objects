public class swipe
{
	public static void main(String[] x)
	{
		int arr[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		int i;
		
		for(int k : arr)
		{
			System.out.print(k + " ");
		}		
		
		for(i = 0 ; i<arr.length ; i+=2)
		{
			int t = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = t;
		}
		System.out.println();
		for(int j : arr)
		{
			System.out.print(j + " ");
		}			
	}
}
