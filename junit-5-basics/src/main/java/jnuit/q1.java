package jnuit;

import java.util.Arrays;

public class q1 {
	public static int[] main (int[] nums) {	
	Arrays.sort(nums);
	int [] minMax= new int[2];
	minMax[0]=nums[0];
	minMax[1]=nums[nums.length-1];	

	return minMax ;
}
	}
