package array;

import java.util.Arrays;

/*
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place.
Example 1:
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
A straightforward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?
 */
public class SetMatrixZeroes {
public static void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean row[]=new boolean[m];
        boolean column[]=new boolean[n];
        for(int i=0; i<m; i++) {
        	for(int j=0; j<n; j++) {
        		if(matrix[i][j]==0) {
        			row[i]=true;
        			column[j]=true;
        		}
        	}
        }
        for(int i=0; i<m; i++) {
        	for(int j=0; j<n; j++) {
        		if(row[i]||column[j]) {
        			matrix[i][j]=0;
        		}
        	}
        }
    }
public static void main(String[] args) {
	int [][] matrix= {{1,1,1},{1,0,1},{1,1,1}};
	setZeroes(matrix);
	
	
}
}
