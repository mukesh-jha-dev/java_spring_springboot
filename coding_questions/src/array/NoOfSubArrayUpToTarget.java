package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*
Problem Statement
Given an integer array nums and an integer target, return all 2-element subarrays (i.e. pairs of elements) whose sum is equal to target.
You must return all value-based pairs, not their indices.
Each pair should be returned in the form [a, b] where a + b == target and a occurs before b in the array (i.e., no duplicate reverse pairs like [b, a] if [a, b] already exists).
You should also return the total number of such valid pairs.
Example-1
Input:
nums = [2, 7, 11, 15, -2, 3, 4]
target = 9
Output:
[[2, 7], [11, -2]]
Total pairs: 2
Example-2
Input:
nums = [1, 5, 3, 3, 4]
target = 6
Output:
[[1, 5], [3, 3], [2, 4]]
Total pairs: 3
Follow-up
Can you solve it in O(n) time using a HashMap?
Can you avoid returning duplicate value pairs (e.g., both [2, 7] and [7, 2])?
 */

public class NoOfSubArrayUpToTarget {
	public static List<int []> totalNoOfSubArrayUpToTargetBruteForce(int []arr,int target) {
		List<int []> arrayList=new ArrayList<int []>();
		int count=0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
					if(arr[i]+arr[j]==target) {
						count++;
						arrayList.add(new int[] {arr[i],arr[j]});
					}
			}
		}
		System.out.println("Count is ::{},"+count);
		return arrayList;
	}
	public static List<int []> totalNoOfSubArrayUpToTargetOptimized(int []arr,int target) {
		List<int []> list=new ArrayList<>();
		Set<Integer> set=new HashSet<>();
		int count=0;
		for(int i=0; i<arr.length; i++) {
			int complement=target-arr[i];
			if(set.contains(complement)) {
				count++;
				list.add(new int[] {complement,arr[i]});
			}
			set.add(arr[i]);
		}
		System.out.println("Count is ::{},"+count);
		return list;
	}
	public static void main(String[] args) {
		int []nums = {2, 7, 11, 15, -2, 3, 4};
				int target = 9;
				 List<int[]> totalNoOfSubArrayUpToTargetBruteForce = totalNoOfSubArrayUpToTargetBruteForce(nums, target);
				 totalNoOfSubArrayUpToTargetBruteForce.forEach(i->System.out.println(Arrays.toString(i)));
				int [] nums1 = {1, 5, 3, 3, 4};
						 int target1= 6;
						 List<int[]> totalNoOfSubArrayUpToTargetBruteForce1 = totalNoOfSubArrayUpToTargetBruteForce(nums1, target1);
						 totalNoOfSubArrayUpToTargetBruteForce1.forEach(i->System.out.println(Arrays.toString(i)));
						 
						 int []nums2 = {2, 7, 11, 15, -2, 3, 4};
							int target2= 9;
							 List<int[]> totalNoOfSubArrayUpToTargetOptimized = totalNoOfSubArrayUpToTargetOptimized(nums2, target2);
							 totalNoOfSubArrayUpToTargetOptimized.forEach(i->System.out.println(Arrays.toString(i)));
							int [] nums3 = {1, 5, 3, 3, 4};
									 int target3= 6;
									 List<int[]> totalNoOfSubArrayUpToTargetOptimized1 = totalNoOfSubArrayUpToTargetOptimized(nums3, target3);
									 totalNoOfSubArrayUpToTargetOptimized1.forEach(i->System.out.println(Arrays.toString(i)));
	}
		
}
