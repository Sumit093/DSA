class Solution{
    public int[] platesBetweenCandles(String s,int[][] queries){
        int n=s.length();
        int q=queries.length;
        int[] prefix=new int[n];
        int[] leftCandle=new int[n];
        int[] rightCandle=new int[n];
        int plates=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '*'){
                plates++;
            }
            prefix[i]=plates;
        }

        int last=-1;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '|'){
                last=i;
            }
            leftCandle[i] = last;
        }

        last=-1;
        for(int i=n-1;i>= 0;i--){
            if(s.charAt(i) == '|'){
                last=i;
            }
            rightCandle[i]=last;
        }
        int[] ans=new int[q];
        for(int i=0;i<q;i++){
            int left = rightCandle [queries[i][0]];
            int right = leftCandle[queries[i][1]];

            if(left == -1 || right==-1 || left>=right){
                ans[i] = 0;
            }else{
                ans[i] = prefix[right]-prefix[left];
            }
        }

        return ans;
    }
}