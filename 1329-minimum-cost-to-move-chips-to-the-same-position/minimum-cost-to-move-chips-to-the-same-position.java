class Solution {
    public int minCostToMoveChips(int[] position) {
        int minCost = Integer.MAX_VALUE;

        for (int target : position) {
            int cost = 0;

            for (int p : position) {
                int dist = Math.abs(p - target);

                if (dist % 2 == 1) {
                    cost++;  
                }
            }

            minCost = Math.min(minCost, cost);
        }

        return minCost;
    }
}
