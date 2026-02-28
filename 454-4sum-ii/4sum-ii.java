class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();

        //1+2
        for(int a : nums1){
            for(int b : nums2){
                map.put(a+b, map.getOrDefault(a+b, 0)+1);
            }
        }
        int count = 0;
        //3+4
        for(int c :nums3){
            for(int d :nums4){
                int sum = -(c+d);
                count += map.getOrDefault(sum,0);
            }
        }

        return count;
    }
}