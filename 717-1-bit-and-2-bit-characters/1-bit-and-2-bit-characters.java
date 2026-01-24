class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        if(n<=1){
            return true;
        }
        int i=0;
        boolean temp = true; 
        while(i<n){
            if(bits[i]==0){
                temp= true;
                if(n-i<=1){
                    break;
                }
                i++;
            }
            if(bits[i]==1){
                temp=false;
                if(n-i<=2){
                    break;
                }
                i+=2;
            }
        }
        return temp;
        
    }
}