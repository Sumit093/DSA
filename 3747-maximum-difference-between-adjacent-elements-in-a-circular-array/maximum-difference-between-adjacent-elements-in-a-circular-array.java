class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n-1;i++){
            int sub=Math.abs(nums[i]-nums[i+1]);
            ans=Math.max(ans,sub);
        }
        int fl = Math.abs(nums[0]-nums[n-1]);
        if(fl>ans){
            return fl; 
        }
        return ans;

    }
}