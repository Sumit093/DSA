class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int small=0,equal=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<target){
                small++;
            }
            else if(nums[i]==target){
                equal++;
            }
        }
        for(int i=0;i<equal;i++){
            ans.add(i+small);
        }
        return ans;
    }
}