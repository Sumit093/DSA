class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int start = 0,end = n-1;
        while(start<end){
            int mid = ((end-start)/2)+start;
            if(nums[mid]>nums[end]){
                start = mid+1;
            }
            else if(nums[mid]<nums[end]){
                end= mid;
            }
            else{
                end--;
            }
            min = nums[start];
            
        }
        return min;
    }
}