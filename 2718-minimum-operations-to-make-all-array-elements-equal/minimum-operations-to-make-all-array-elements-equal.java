class Solution {
    public List<Long> minOperations(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n = nums.length;
        long[] prefix = new long[n+1];
        for(int i=0;i<n;i++){
            prefix[i + 1] = prefix[i] + nums[i];
        }
        List<Long> ans = new ArrayList<>();
        for (int query:queries) {
            int k = upperBound(nums, query);
            long left = (long)query*k - prefix[k];
            long right = (prefix[n] - prefix[k]) -(long)query*(n-k);
            ans.add(left + right);
        }
        return ans;
    }

    private int upperBound(int[] nums, int target){
        int left=0,right=nums.length;
        while(left<right){
            int mid = left + (right-left)/2;

            if (nums[mid] <=target)left = mid+1;
            else right = mid;
        }
        return left;
    }
}