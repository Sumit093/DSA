class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        int ans=0;
        for(int i=1;i<n;i++){
            if(nums[0]!=nums[i]){
                ans+=Math.abs(nums[0]-nums[i]);
            }
        }
        return ans;        
    }
}