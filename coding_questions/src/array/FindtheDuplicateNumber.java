package array;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and using only constant extra space.
nput: nums = [1,3,4,2,2]
Output: 2
Example 2:
Input: nums = [3,1,3,4,2]
Output: 3
Example 3:
Input: nums = [3,3,3,3,3]
Output: 3
 */
public class FindtheDuplicateNumber {
public static  int findDuplicate(int[] arr) {
	 Map<Integer, Integer> map = new HashMap<>();
     for (int num : arr) {
         map.put(num, map.getOrDefault(num, 0) + 1);
         if (map.get(num) > 1) {
             return num;
         }
     }
        return 0;
    }
public static void main(String[] args) {
	int arr[]= {1,3,4,2,2};
	int duplicate = findDuplicate(arr);
	System.out.println(duplicate);
}
}
