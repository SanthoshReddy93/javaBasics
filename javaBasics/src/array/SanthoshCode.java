package array;

public class SanthoshCode {

	
		class Solution {
		    public int singleNumber(int[] nums) {
		    
		        int result = 0;
		        for (int num : nums) {
		            result ^= num; // XOR operation
		        }
		        return result;
		    }

		    // You can add a main method to test
		    public static void main(String[] args) {
		        SingleNumber sn = new SingleNumber();
		        int[] nums = {4, 1, 2, 1, 2};
		        System.out.println("Single number is: " + sn.singleNumber(nums)); // Output: 4
		    }
		}   
		    	

	}


