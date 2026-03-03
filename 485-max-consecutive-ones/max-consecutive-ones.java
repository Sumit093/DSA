class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n = arr.length;
        if(n==1){
            return arr[0];
        }
        int count=0;
        
        
        int ans=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                ans = Math.max(count, ans);
            }
            else{
                count=0;
            }
        }
        return ans;
    }
}