# Palindrome Number

**Difficulty:** Medium

## Problem Summary
Determine whether an integer reads the same forward and backward without using extra space for a string.

## My Approach
The optimal solution reverses half of the number. By repeatedly taking the last digit of the original number and building a reversed half, we stop when the original number becomes less than or equal to the reversed half. At that point, either the numbers are equal (even length palindrome) or the original number equals the reversed half without its middle digit (odd length palindrome). Edge cases such as negative numbers and numbers ending with zero (except zero itself) are handled upfront.

## Complexity Analysis
- **Time:** O(log10 n)
- **Space:** O(1)

## My Solution
```java
welcome
```

## AI Optimized Solution
```java
public class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindrome; numbers ending with 0 are not palindrome unless the number is 0
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedHalf = 0;
        // Build the reversed half of the number
        while (x > revertedHalf) {
            revertedHalf = revertedHalf * 10 + x % 10;
            x /= 10;
        }
        // For even length numbers x == revertedHalf
        // For odd length numbers the middle digit doesn't matter, so remove it by revertedHalf/10
        return x == revertedHalf || x == revertedHalf / 10;
    }
}
```

## Interview Notes
- Explain why converting to a string is not optimal for this problem.
- Discuss handling of overflow when reversing the full number and how reversing half avoids it.
- Edge cases: negative numbers, numbers ending with zero, and single‑digit numbers.

## Related Problems
- Reverse Integer
- Valid Palindrome
- Integer to Roman
