class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n = moves.length();
        int r=0,l=0,s=0;
        for(int i =0;i<n;i++){
            if(moves.charAt(i)=='L'){
                l++;
            }
            else if(moves.charAt(i)=='R'){
                r++;
            }
            else{
                s++;
            }
        }
        if(l-r>0){
            return l-r+s;
        }
        return r-l+s;
        
    }
}