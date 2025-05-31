package array;

import java.util.Arrays;

/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 */

public class SquaresofaSortedArray {
public static int[] sortedSquares(int[] arr) {
        for(int i=0; i<arr.length; i++) {
        	int num=arr[i]*arr[i];
        	arr[i]=num;
        }
        Arrays.sort(arr);
        return arr;
    }
public static int[] sortedSquaresTwoPonterApproach(int[] arr) {
	int left=0; int right=arr.length-1; int index=arr.length-1;
	int[] result = new int[arr.length];
    while(left<=right) {
    	int leftSquare=arr[left]*arr[left];
    	int rightSquare=arr[right]*arr[right];
    	if(leftSquare>rightSquare) {
    		result[index--]=leftSquare;
    		left++;
    	}else {
    		result[index--]=rightSquare;
    		right--;
    	}
    }
    return result;
}
public static void main(String[] args) {
	int arr[]= {-4,-1,0,3,10};
	int arr1[]= {-7,-3,2,3,11};
//	System.out.println(Arrays.toString(sortedSquares(arr)));
//	System.out.println(Arrays.toString(sortedSquares(arr1)));
	System.out.println(Arrays.toString(sortedSquaresTwoPonterApproach(arr)));
	System.out.println(Arrays.toString(sortedSquaresTwoPonterApproach(arr1)));
}
}
