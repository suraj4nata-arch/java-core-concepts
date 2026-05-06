package Arrays;

public class SmallestNumberInAArray 
{
	public static void main(String[] args) {
		int[] arr = {12,24,3,25,23};
		int min=arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}
