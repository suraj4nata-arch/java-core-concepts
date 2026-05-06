package Arrays;

public class Traversing2DArrayUsingForLoop 
{
	public static void main(String[] args) {
		int[][] arr= {
				{1,2,3},
				{2,3,4},
				{4,5,6}
		};
		for(int i=0; i<arr.length;i++) {  //row
			for(int j=0; j<arr[i].length;j++) {  //column
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
	}
}
