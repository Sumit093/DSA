class Solution {
    public int strStr(String haystack, String needle) {
        int i=0;
        int j=0;
        int ans=1000;
        while(i<=haystack.length()-1){
            if(haystack.charAt(i)==needle.charAt(j)){
                ans=Math.min(i,ans);
                if(j==needle.length()-1){
                    return ans;
                }
                i++;
                j++;
            }
            else if(j>0 && haystack.charAt(i)!=needle.charAt(j)){
                i=ans+1;
                j=0;
                ans=1000;
            }
            else{
                i++;
                j=0;
                ans=1000;
            }
        }
        return -1;
        
    }
}