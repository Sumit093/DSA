class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();

        for(int i= left;i<=right;i++){
            int temp = i;
            boolean ok = true;

            while(temp > 0){
                int d = temp % 10;

                if (d== 0 || i%d!=0){
                    ok = false;
                    break;
                }

                temp /= 10;
            }

            if(ok){
                ans.add(i);
            }
        }
        return ans;
    }
}
