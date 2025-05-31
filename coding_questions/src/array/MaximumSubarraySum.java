package array;

import java.util.Arrays;

/*
 Given an integer array nums, find the subarray with the largest sum, and return its sum.
Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
Constraints:
1 <= nums.length <= 105
-104 <= nums[i] <= 104
Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class MaximumSubarraySum {
   public static int maxSumSubArrayBruteForce(int arr[]) {
	   int maxSum=Integer.MIN_VALUE;
	   int start =0;
	   int end=0;
	   for(int i=0; i<arr.length; i++) {
		   int currSum=0;
		   for(int j=i; j<arr.length; j++) {
			   currSum=currSum+arr[j];
			   if(currSum>maxSum) {
				   maxSum=currSum;
				   start=i;
				   end=j;
			   }
		   }
	   }
	   int arr1[]=Arrays.copyOfRange(arr, start, end+1);
	   System.out.println(Arrays.toString(arr1));
	   return maxSum;
   }
   public static int maxSumSubArrayOptimized(int arr[]) {
	   int maxSum=arr[0];
	   int currSum=arr[0];
	   for(int i=1; i<arr.length; i++) {
		 currSum=Math.max(arr[i], currSum+arr[i]);
		 maxSum=Math.max(maxSum, currSum);
	   }
	   return maxSum;
   }
   

    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSubArray = maxSumSubArrayBruteForce(arr);
        System.out.println("Maximum Subarray Sum BruteForce Approach: " + maxSubArray);
        
        int maxSumSubArrayOptimized = maxSumSubArrayOptimized(arr);
        System.out.println("Maximum Subarray Sum Optimized Approach: " + maxSumSubArrayOptimized);
        
    }
}