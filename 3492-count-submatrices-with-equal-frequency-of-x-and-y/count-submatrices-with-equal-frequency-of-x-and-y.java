class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int count = 0;
        int m = grid.length, n = grid[0].length;
        
        int[][] xPrefix = new int[m + 1][n + 1];
        int[][] yPrefix = new int[m + 1][n + 1];
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                xPrefix[i][j] = xPrefix[i - 1][j] + xPrefix[i][j - 1] - xPrefix[i - 1][j - 1];
                yPrefix[i][j] = yPrefix[i - 1][j] + yPrefix[i][j - 1] - yPrefix[i - 1][j - 1];
                
                if (grid[i - 1][j - 1] == 'X') xPrefix[i][j]++;
                else if (grid[i - 1][j - 1] == 'Y') yPrefix[i][j]++;
            }
        }
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int xCount = xPrefix[i][j];
                int yCount = yPrefix[i][j];
                if (xCount == yCount && xCount > 0) count++;
            }
        }
        
        return count;
    }
}