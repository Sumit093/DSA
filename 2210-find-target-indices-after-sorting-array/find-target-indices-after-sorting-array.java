class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        
        
        int f = lower(nums,target);
        if(f==nums.length||nums[f]!=target){
        return ans;
        }
        int l = upper(nums,target);

        for(int i=f;i<=l;i++){
            ans.add(i);
        }
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