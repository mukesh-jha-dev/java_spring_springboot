package array;

/*
 You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 Example1
 Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 Output: [[7,4,1],[8,5,2],[9,6,3]]
 Example2
 Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
 Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 [5,1,9,11]--------->>[15,13,2,5]
 [2,4,8,10]--------->>[14,3,4,1]
 [13,3,6,7]--------->>[12,6,8,9]
 [15,14,12,16]------>>[16,7,10,11]
 */
public class RotateImage {
	public static void rotate(int[][] arr) {
		int m=arr.length;
		int start=0;
		for(int i=0; i<m; i++) {
			for(int j=start; j<m; j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
			start++;
		}
		for(int i=0; i<m; i++) {
			for(int j=0; j<m/2; j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[i][m-1-j];
				arr[i][m-1-j]=temp;
			}
	}
	
	}
	public static void main(String[] args) {
		int arr[][]= {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		rotate(arr);
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
