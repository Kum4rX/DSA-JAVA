class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums2.length;

        for (int i = 0; i < n; i++) {
            int nextGreater = -1;

            for (int j = i + 1; j < n; j++) {
                if (nums2[j] > nums2[i]) {
                    nextGreater = nums2[j];
                    break;
                }
            }
            map.put(nums2[i], nextGreater);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
    }
}