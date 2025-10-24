package array;

import java.util.HashSet;
import java.util.Set;

/*
 *Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
  You must write an algorithm that runs in O(n) time.
  Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
Example 3:
Input: nums = [1,0,1,2]
Output: 3
 */
public class LongestConsecutiveSequence {
public static int longestConsecutiveBruteForce(int[] arr) {
	int maxCount=0;
        for(int i=0; i<arr.length; i++) {
        		int currNum=arr[i];
        		int currStreak=1;;
        		while(contains(arr,currNum+1)) {
        			currNum++;
        			currStreak++;
        			maxCount=Math.max(maxCount, currStreak);
        		}
        	}
        return maxCount;
    }
public static boolean contains(int arr[],int target) {
	for(int a:arr) {
		if(a==target) {
			return true;
		}
	}
	return false;
}
public static int optimized(int[] arr) {
	int maxCount=0;
	Set<Integer> set=new HashSet<Integer>();
       for(int num:arr) {
    	   set.add(num);
       }
       for(int i:set) {
    	   if(!set.contains(i-1)) {
    		   int currNum=i;
    		   int currStreak=1;
    		   while(set.contains(currNum+1)) {
    			   currNum++;
    			   currStreak++;
    			   
    		   }
    		   maxCount=Math.max(currStreak, maxCount);
    		   
    	   }
    	   
       }
        return maxCount;
    }
public static void main(String[] args) {
	int arr[]= {100,4,200,1,3,2};
	int longestConsecutive = longestConsecutiveBruteForce(arr);
	System.out.println(longestConsecutive);
	int optimized = optimized(arr);
	System.out.println(optimized);
	
}
}
