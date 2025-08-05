class Solution {
public:
    bool isPowerOfFour(int n) {
        if (n <= 0) return false;

        // Check if it's a power of 2 AND (n-1) is divisible by 3
        return (n & (n - 1)) == 0 && (n - 1) % 3 == 0;
    }
};