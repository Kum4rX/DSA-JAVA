class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        int sum = 0;
        int digit = 0;
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            sum = 0;
            while (n > 0) {
                digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
    
}