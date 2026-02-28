class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>(); 
        
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                if(i > 0 && nums[i] == nums[i-1]){
                    continue;
                }
                if(j>i+1 && nums[j] == nums[j-1]){
                    
                    continue;
                }   
                
                int left = j+1;
                int right = n-1;

                while(left<right){
                    long sum = (long)nums[i]+nums[left]+nums[right]+nums[j];
                    if(sum==target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        temp.add(nums[j]);
                        ans.add(temp);
                        right--;
                        left++;

                        while(left<right && nums[left]== nums[left-1]){
                            left++;
                        }
                        while(left<right && nums[right]== nums[right+1]){
                            right--;
                        }
                    }
                    else if(sum>target){
                        right--;
                    }
                    else{
                        left++;
                    }
                }
                
            }

            
        }
        return ans;
    }
}