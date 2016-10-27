package array;

import java.util.Arrays;

/**
 * 414. Third Maximum Number
 * Given a non-empty array of integers,return the third maximum number in this array.if it does 
 * not exist,return the maximum number.
 * example1:
 * Input: [3, 2, 1]
 * Output: 1
 * example2:
 * Input: [1, 2]
 * Output: 2
 * example3:
 * Input: [2, 2, 3, 1]
 * Output: 1
 * */

public class Solution414 {
	public int thirdMax(int[] nums){
		boolean flag=false;
		Arrays.sort(nums);//ÉýÐò
		int max=nums[0],second=nums[0], third=nums[0];
		for(int i=nums.length-1;i>=0;i--){
			if(nums[i]>=max){
				max=nums[i];
			}else if (nums[i]<max && nums[i]>=second) {
				second=nums[i];
			}else if (nums[i]<second && nums[i]>=third) {
				third=nums[i];
				flag=true;
			}
			
		}
		if (flag) {
			return third;
		} else {
			return max;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
