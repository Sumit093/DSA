class Solution {
    public int[] sortByBits(int[] arr) {

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }

        Collections.sort(list, (a, b) -> {
            int c1 = Integer.bitCount(a);
            int c2 = Integer.bitCount(b);

            if(c1 == c2){
                return a - b;
            }
            return c1 - c2;
        });

        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }

        return res;
    }
}