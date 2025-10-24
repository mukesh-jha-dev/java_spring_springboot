package array;

import java.util.ArrayList;
import java.util.List;

/*
 Given an m x n matrix, return all elements of the matrix in spiral order.
 Example1
 Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 Output: [1,2,3,6,9,8,7,4,5]
 Example2
 Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */
public class SpiralMatrix {
	public static  List<Integer> spiralOrder(int[][] arr) {
		int m=arr.length;
		int n=arr[0].length;
		int startRow=0;int endRow=m-1;
		int startColumn=0;int endColumn=n-1;
		List<Integer> list=new ArrayList<Integer>();
		//left to right
		while(startRow<=endRow && startColumn<=endColumn) {
			for(int i=startColumn; i<=endColumn; i++) {
				list.add(arr[startRow][i]);
			}
			startRow++;
			//top to bottom
			for(int i=startRow; i<=endRow; i++) {
				list.add(arr[i][endColumn]);
			}
			endColumn--;;

			// Right to Left
			if (startRow <= endRow) {
				for (int i = endColumn; i >= startColumn; i--) {
					list.add(arr[endRow][i]);
				}
				endRow--;
			}

			// Bottom to Top
			if (startColumn <= endColumn) {
				for (int i = endRow; i >= startRow; i--) {
					list.add(arr[i][startColumn]);
				}
				startColumn++;
			}
		}
		return list;
	}
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{5,6,7},{8,9,10},{11,12,13}};
		List<Integer> spiralOrder = spiralOrder(arr);
		System.out.println(spiralOrder);
	}
	       

}
