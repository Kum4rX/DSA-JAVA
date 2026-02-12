class Solution {

    public int longestBalanced(String s) {

        int n = s.length();
        int maxLength = 0;

        for (int i = 0; i < n; i++) {

            int[] count = new int[26];
            for (int j = i; j < n; j++) {
                count[s.charAt(j) - 'a']++;

                if (isBalanced(count)) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }

    private boolean isBalanced(int[] freq) {

        int value = 0;

        for (int f : freq) {
            if (f > 0) {
                if (value == 0)
                    value = f;
                else if (value != f)
                    return false;
            }
        }
        return true;
    }
}
