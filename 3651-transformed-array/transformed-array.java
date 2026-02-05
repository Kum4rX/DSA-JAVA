class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            if(nums[i] > 0) {
                int newIndex = (i + nums[i]) % n;
                result[i] = nums[newIndex];
            }
            else if(nums[i] < 0) {
                int steps = Math.abs(nums[i]);
                int newIndex = (i - steps % n + n) % n;
                result[i] = nums[newIndex];
            }
            else {
                result[i] = 0;
            }           
        }
        return result;
    }
}