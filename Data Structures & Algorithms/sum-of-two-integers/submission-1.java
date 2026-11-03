class Solution {
    public int getSum(int a, int b) {
     
        while (b != 0) {
            // 1. Find the carry bits using AND
            int carry = a & b;

            // 2. Sum the bits without including carries using XOR
            a = a ^ b;

            // 3. Shift the carry left by 1 to align it with the next higher bit
            b = carry << 1;
        }
        
        // When b is 0, 'a' contains the complete sum
        return a;
    
    }
}
