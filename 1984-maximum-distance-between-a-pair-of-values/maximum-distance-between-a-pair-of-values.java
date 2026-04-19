class Solution {
    public int maxDistance(int[] nums1, int[] nums2){
        int n =nums1.length;
        int m = nums2.length;
        
        int i=0;
        int ans =0;
        while(i<n){
            int j = i;
            int low = j,high = m-1;
            int target = nums1[i];
            while(low<=high){
                int mid = (low+high)/2;
                if(target<=nums2[mid]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            ans=Math.max(ans, low-i);
            i++;
        }
        if(ans==0){
            return 0;
        }
        return ans-1;
    }
}

// class Solution {
//     public int maxDistance(int[] nums1, int[] nums2){
//         int n =nums1.length;
//         int m = nums2.length;
        
//         int i=0;
//         int ans =0;
//         while(i<n){
//             int j = i;
//             while(j<m && nums1[i]<=nums2[j]){
//                 ans = Math.max(ans, j-i);
//                 j++;
//             }
//             i++;
//         }
//         return ans;
//     }
// }