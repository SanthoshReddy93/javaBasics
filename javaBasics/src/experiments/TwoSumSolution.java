package experiments;

import java.util.HashMap;

public class TwoSumSolution {
   public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            
            numMap.put(nums[i], i);
        }
        
        // Since the problem guarantees one solution, this line is never reached
        return new int[] {};
    }
  
    // Test method
    public static void main(String[] args) {
        TwoSumSolution solution = new TwoSumSolution();
        int[] nums = {1, 7, 11, 2};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}