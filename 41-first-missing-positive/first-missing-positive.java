class Solution {

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }


    public int firstMissingPositive(int[] nums) {
        if(nums[0]==1 && nums.length==1){
            return 2;
        }
        Arrays.sort(nums);
        int one = binarySearch(nums,1);
        if(one==-1){
            return 1;
        }
        int temp=1;
        for(int i=one;i<nums.length;i++){
            // while(nums[i]==nums[i+1]){
            //     i++;
            // }
            if(nums[i]==temp){
                temp++;
            }
            else if(nums[i]>temp){
                return temp;
            }
        
        }
        return temp;
    }
}