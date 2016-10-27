package array;
/**
 * Given a m*n grid filled with non-negative numbers,find a path form top left to bottom right
 * which minimizes the sum of all numbers along its path.
 * Note:You can only move either down or right at any point in time.
 * 动态规划
 * 2016.10.26
 * */

public class Solution64 {
	public int minPathSum(int[][] grid){
		if(grid.length==0){
			return 0;
		}
		int m=grid.length;
		int n=grid[0].length;
		for(int i=1;i<m;i++){
			grid[i][0]+=grid[i-1][0];
			}
		for(int j=1;j<n;j++){
			grid[0][j]+=grid[0][j-1];
		}
		for(int i=1;i<m;i++){
			for(int j=1;j<n;j++){
				grid[i][j]+=Math.min(grid[i-1][j], grid[i][j-1]);
			}
			
		}
		System.out.println(grid[m-1][n-1]);
		return grid[m-1][n-1];
	}
	public int minPathSum2(int[][] grid){
		int down,right;
		int m=0,n=0;
		int sum=grid[m][n];
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[i].length;j++){
				if(m<grid.length-1 && n<grid[i].length-1){
				down=grid[m+1][n];
				right=grid[m][n+1];
				if(down<right){
					sum+=down;
					m=m+1;
				}else if(down>right){
					sum+=right;
					n=n+1;
				}else if(down==right){
					
				}
				}else if(m==grid.length-1 && n<grid[i].length-1){
					right=grid[m][n+1];
					sum+=right;
					n=n+1;
				}else if(n==grid[i].length-1 && m<grid.length-1){
					down=grid[m+1][n];
					sum+=down;	
					m=m+1;
				}
			}
			
		}
		
		System.out.println(sum);
		return sum;
		
	}
	public static void main(String args[]) {
		int grid[][]={{1,2,3},{4,5,6},{7,8,9}};
		new Solution64().minPathSum(grid);
	}
}
