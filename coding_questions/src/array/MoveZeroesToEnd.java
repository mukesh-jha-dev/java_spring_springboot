package array;

import java.util.Arrays;

/*
 Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:
Input: nums = [0]
Output: [0]
 */

public class MoveZeroesToEnd {
	
	public static int[] moveZeros(int arr[]) {
		int indexes=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				arr[indexes++]=arr[i];
			}
		}
		while(indexes<arr.length) {
			arr[indexes++]=0;
		}
		return arr;
		
	}
	public static void main(String[] args) {
		int arr[]= {0,1,0,3,12};
		int[] moveZeros = moveZeros(arr);
		System.out.println(Arrays.toString(moveZeros));
	}

}
