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