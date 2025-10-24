package array;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.
Example 1:
Input: nums = [1,1,1], k = 2
Output: 2
Example 2:
Input: nums = [1,2,3], k = 3
Output: 2
 */
public class SubarraySumEqualsK {
	public static int subarraySum(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);
		int count = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (map.containsKey(sum - k)) {
				count = count + map.get(sum - k);
			}

			map.put(sum, map.getOrDefault(sum, 0) + 1);

		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1 };
		int arr1[] = { 1, 2, 3 };
		System.out.println(subarraySum(arr, 2));
		System.out.println(subarraySum(arr1, 3));
	}
}
