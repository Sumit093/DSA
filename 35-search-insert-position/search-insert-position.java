class Solution {
    public int searchInsert(int[] nums, int target) {

        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                return i;
            }
        }
        if(target<nums[0]){
            return 0;
        }
        int index = 0;
        for(int i=0;i<n;i++){
            if(nums[i]<target){
                index = i;
            }
        }
        
        return index+1;

    }
}