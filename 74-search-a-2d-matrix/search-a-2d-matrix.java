class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;
        int col = matrix[0].length;

        int i = 0;
        int j = col - 1;

        while (i < row && j >= 0) {
            int element = matrix[i][j];

            if (element == target) {
                return true;
            } else if (element < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}