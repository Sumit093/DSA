// class Solution {
//     public int maxDistance(int[] colors) {
//         int n=colors.length;
//         int i = 0;
//         int j = i+1;
//         int maxDiff = 0;
//         while(i<n){
//             if(colors[i]!=colors[j]){
//                 maxDiff = Math.max(maxDiff,Math.abs(i-j));
//             }
//             j++;
//         }
    
// }


class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int fh = 0;
        int maxDiff = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j<n ; j++){
                if(colors[i]!=colors[j] && Math.abs(i-j)>maxDiff ){
                    maxDiff = Math.abs(i-j);
                }
            }
        }
        return maxDiff;
    }
}