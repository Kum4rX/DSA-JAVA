class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int count = 0;
        int m = grid.length, n = grid[0].length;
        
        // Prefix sum for O(1) submatrix sum calculation
        int[][] prefix = new int[m + 1][n + 1];
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefix[i][j] = grid[i-1][j-1] + prefix[i-1][j] + prefix[i][j-1] - prefix[i-1][j-1];
            }
        }
        
        // Check all submatrices from (0,0) to (i,j)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = prefix[i+1][j+1]; // Sum from (0,0) to (i,j)
                if (sum <= k) count++;
            }
        }
        return count;
    }
}