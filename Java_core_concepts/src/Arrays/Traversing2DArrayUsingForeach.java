package Arrays;

public class Traversing2DArrayUsingForeach 
{
	public static void main(String[] args) {
		int[][] arr= {
				{1,2,3},
				{2,3,4},
				{4,5,6}
		};
		
		for(int[] row: arr) { //For each row in the arr
		for(int num:row) {    //Inside that row, go through each number
			System.out.print(num + " ");
		}
		}
	}
}
