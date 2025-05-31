package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Difficulty: Easy
Topics: Arrays, Hash Table

Problem Statement:
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
Constraints:
2 <= nums.length <= 10⁴
-10⁹ <= nums[i] <= 10⁹
-10⁹ <= target <= 10⁹
Only one valid answer exists
 */
public class TwoSum {
	
	public static int[] twoSumBruteForce(int[] nums, int target) {
		//brute force
		for(int i=0; i<nums.length-1; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]+nums[j]==target) {
					return new int[]{i,j};
				}
			}
		}
		return new int[] {};
	}
	public static int[] twoSumOptimized(int[] nums, int target) {
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; i++) {
			int complement=target-nums[i];
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement),i};
			}
			map.put(nums[i], i);
		}
		return new int[] {};
	}
	public static void main(String[] args) {
		int []nums = {2,7,11,15}; int target = 9;
		int []nums1 = {3,2,4}; int target1 = 6;
		int []nums2 = {3,3}; int target2 = 6;
		int[] twoSum = twoSumOptimized(nums,target);
		System.out.println(Arrays.toString(twoSum));
		int[] twoSum1 = twoSumOptimized(nums1,target1);
		System.out.println(Arrays.toString(twoSum1));
		int[] twoSum2 = twoSumOptimized(nums2,target2);
		System.out.println(Arrays.toString(twoSum2));
	}
}
