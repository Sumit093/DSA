class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i=0,j=n-1;
        int MaxWaterAmount =0;
        while(i<j){
            int minHeightLine = Math.min(height[i],height[j]);
            int currentWaterAmount =  minHeightLine * (j-i);
            MaxWaterAmount = Math.max(currentWaterAmount,MaxWaterAmount);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return MaxWaterAmount;
    }
}