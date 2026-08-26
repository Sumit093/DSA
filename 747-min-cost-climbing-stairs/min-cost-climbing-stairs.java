class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prev1 = 0;
        int prev2 = 0;
        for(int i=0;i<cost.length;i++){
            int c1= Math.min(prev1 + cost[i],prev2 + cost[i]);
            prev2  = prev1;
            prev1 = c1;

        }
        return Math.min(prev1,prev2);

    }
}