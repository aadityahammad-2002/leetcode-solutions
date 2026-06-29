# Two Sum

**Difficulty:** Easy

## Problem Summary
Given an array of integers and a target sum, find two numbers that add up to the target and return their indices. The solution assumes that each input has exactly one solution and does not use the same element twice.

## My Approach
The provided solution utilizes a HashMap to store the numbers in the array as keys and their indices as values. It iterates through the array, calculating the complement of each number with respect to the target sum. If the complement is found in the HashMap, it returns the indices of the complement and the current number.

## Complexity Analysis
- **Time:** O(n)
- **Space:** O(n)

## My Solution
```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
         Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[] {numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }
}
```

## AI Optimized Solution
```java
The provided code is already optimized with a time complexity of O(n). However, here is the same code with some minor improvements for readability and error handling: ```java class Solution { public int[] twoSum(int[] nums, int target) { if (nums == null || nums.length < 2) { return new int[] {}; } Map<Integer, Integer> numToIndex = new HashMap<>(); for (int i = 0; i < nums.length; i++) { int complement = target - nums[i]; if (numToIndex.containsKey(complement)) { return new int[] {numToIndex.get(complement), i}; } numToIndex.put(nums[i], i); } return new int[] {}; } }```
```

## Interview Notes
- Be prepared to explain the trade-off between time and space complexity in this solution.
- Make sure to discuss the assumption that each input has exactly one solution and how this affects the solution.

## Related Problems
- 3Sum
- 4Sum
