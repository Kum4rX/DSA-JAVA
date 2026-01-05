class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long totalSum = 0;
        int negCount = 0;
        int minAbs = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int val = matrix[i][j];

                totalSum += Math.abs(val);

                if (val < 0) {
                    negCount++;
                }
                minAbs = Math.min(minAbs, Math.abs(val));
            }
        }
        if (negCount % 2 == 0) {
            return totalSum;
        } else {
            return totalSum - 2L * minAbs;
        }
    }
}