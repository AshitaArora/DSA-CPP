class Solution {
public:
    bool isPowerOfThree(int n) {
         if (n <= 0) return false;   // Negative numbers and 0 are not powers of 3
        if (n == 1) return true;    // 3^0 = 1 (base case)
        if (n % 3 != 0) return false; // If not divisible by 3, stop
        return isPowerOfThree(n / 3);
        
    }
};