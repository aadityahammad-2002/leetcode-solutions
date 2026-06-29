The provided code is already optimized with a time complexity of O(n). However, here is the same code with some minor improvements for readability and error handling: 
  ```java 
  class Solution { 
      public int[] twoSum(int[] nums, int target) { 
         if (nums == null || nums.length < 2) { 
           return new int[] {}; 
         } 
        Map<Integer, Integer> numToIndex = new HashMap<>(); 
        for (int i = 0; i < nums.length; i++) { int complement = target - nums[i]; 
            if (numToIndex.containsKey(complement)) { 
              return new int[] {numToIndex.get(complement), i}; 
            } 
         numToIndex.put(nums[i], i); 
        } 
      return new int[] {}; 
    } 
}```
