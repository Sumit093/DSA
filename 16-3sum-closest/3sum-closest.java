class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = nums[0] + nums[1] + nums[2];
        int i=0;    
        while(i<n-2){
            // if(i > 0 && nums[i] == nums[i - 1]){
            //     i++;
            //     continue;
            // }   
            
            int left = i+1;
            int right = n-1;

            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];

                if(Math.abs(sum - target) < Math.abs(ans - target)){
                    ans = sum;
                }
                else if(sum>target){
                    
                    right--;
                }
                else{
                    
                    left++;
                }
            }

            i++;
        }
        return ans;
    }
}