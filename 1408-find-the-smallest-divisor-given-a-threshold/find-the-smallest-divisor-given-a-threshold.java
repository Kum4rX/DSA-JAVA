class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
       int low = 1;
       int high = 0;

       for(int x : nums)
       high = Math.max(high, x);

       int ans = high;

       while (low <= high) {
        int mid = (low + high) / 2;

        int sum = 0;

        for (int x : nums) {
            sum += (x + mid - 1) / mid;
        }
        if(sum <= threshold) {
            ans = mid;
            high = mid - 1;
        }
        else {
            low = mid + 1;
        }
       }
       return ans;
    }
}