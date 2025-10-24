package array;
/*
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:
Input: height = [4,2,0,3,2,5]
Output: 9
 */
public class TrappingRainWater {
public static int trap(int[] height) {
	int []left=new int[height.length];
	int []right=new int[height.length];
	left[0]=height[0];
	right[height.length-1]=height[height.length-1];
       for(int i=1; i<height.length; i++) {
    	   left[i]=Math.max(left[i-1], height[i]);
       }
       for(int i=height.length-2; i>=0; i--) {
    	   right[i]=Math.max(right[i+1], height[i]);
       }
       int ans=0;
       for(int i=0; i<height.length; i++) {
    	   ans=ans+Math.min(left[i], right[i])-height[i];
       }
       return ans;
    }
public static void main(String[] args) {
	int arr[]= {0,1,0,2,1,0,1,3,2,1,2,1};
	int trap = trap(arr);
	System.out.println(trap);
}
}
