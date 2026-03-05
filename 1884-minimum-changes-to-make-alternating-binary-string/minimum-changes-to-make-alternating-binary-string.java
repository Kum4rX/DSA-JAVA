class Solution {
    public int minOperations(String s) {

        int changes1 = 0;
        int changes2 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != (i % 2 == 0 ? '0' : '1')) {
                changes1++;
            }
            if (s.charAt(i) != (i % 2 == 0 ? '1' : '0')) {
                changes2++;
            }
        }

        return Math.min(changes1, changes2);
    }
}
