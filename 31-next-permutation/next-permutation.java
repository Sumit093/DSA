class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;

        int index = -1;
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            reverse(nums, 0, n - 1);
            return;
        }
        
        for(int k = n - 1; k > index; k--){
            if(nums[k] > nums[index]){
                int temp = nums[index];
                nums[index] = nums[k];
                nums[k] = temp;
                break;
            }
        }
        reverse(nums, index + 1, n - 1);
    }

    public static void reverse(int[] nums, int i, int j){
        while (i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}