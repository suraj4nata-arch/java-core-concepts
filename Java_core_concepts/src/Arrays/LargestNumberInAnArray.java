package Arrays;

public class LargestNumberInAnArray 
{
	public static void main(String[] args) {
		
		int[] arr= {21,32,13,44,15};
		int max=arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Max= "+max);
	}
}
