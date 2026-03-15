class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        
        
        int f = lower(nums,target);
        ans[0]=f;
         if(f==nums.length||nums[f]!=target){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
         }
        ans[1] = upper(nums,target);
        
        
        return ans;
        
    }
    public int lower(int[] nums, int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int mid =low+(high-low)/2;
        while(low<=high){
            mid = low+(high-low)/2;
            if(nums[mid]>=target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }

    public int upper(int[] nums, int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int mid =low+(high-low)/2;
        while(low<=high){
            mid = low+(high-low)/2;
            if(nums[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return high;
    }
}