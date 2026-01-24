class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m= nums1.length;
        int n= nums2.length;
        int[] merge = new int[m+n];
        
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                merge[k++]=nums2[j++];
            }
            else{
                merge[k++]=nums1[i++];
            }
        }
        while(i<m){
            merge[k++]=nums1[i++];
        }
        while(j<n){
            merge[k++]=nums2[j++];
        }
        //median
        if((m+n)%2==0){
            return (merge[(m+n)/2 -1]+merge[(m+n)/2])/2.0;
        }
        return merge[(n+m)/2];
    }
}