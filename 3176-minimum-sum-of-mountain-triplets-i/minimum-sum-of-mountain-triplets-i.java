class Solution{
    public int minimumSum(int[] nums){
        int n=nums.length;
        if(n<3){
            return -1;
        }
        int[] leftMin=new int[n];
        int[] rightMin=new int[n];
        leftMin[0]=nums[0];
        for(int i=1;i<n;i++){
            leftMin[i]=Math.min(leftMin[i-1],nums[i]);
        }
        rightMin[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            rightMin[i]=Math.min(rightMin[i+1],nums[i]);
        }
        int minSum=Integer.MAX_VALUE;
        for(int j=1;j<n-1;j++){
            if(leftMin[j-1]<nums[j]&&rightMin[j+1]<nums[j]){
                int curr=leftMin[j-1]+nums[j]+rightMin[j+1];
                minSum=Math.min(minSum,curr);
            }
        }
        if(minSum==Integer.MAX_VALUE){
            return -1;
        }
        return minSum;
    }
}