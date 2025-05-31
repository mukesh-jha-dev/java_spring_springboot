package array;
/*
 Given an array of integers arr, return true if and only if it is a valid mountain array.
Recall that arr is a mountain array if and only if:
arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Example 1:
Input: arr = [2,1]
Output: false
Example 2:
Input: arr = [3,5,5]
Output: false
Example 3:
Input: arr = [0,3,2,1]
Output: true
 */

public class ValidMountainArray {
	public static boolean isMountain(int arr[]) {
		int max=Integer.MIN_VALUE;
		int index=0;
		if(arr.length<3) {
			return false;
		}
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i] ){
				max=arr[i];
				index=i;
			}
		}
		if (index == 0 || index == arr.length - 1) {
            return false;
        }
		for(int i=0; i<index; i++) {
			if(arr[i]>=arr[i+1]) {
				return false;
			}
		}
		for(int i=index; i<arr.length-1; i++) {
			if(arr[i]<=arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int arr1[]= {3,5,5};
		int arr2[]= {0,3,2,1};
		int arr3[]={1,1,1,1,1,1,1,2,1};
	System.out.println(isMountain(arr1));
	System.out.println(isMountain(arr2));
	System.out.println(isMountain(arr3));
	}

}
