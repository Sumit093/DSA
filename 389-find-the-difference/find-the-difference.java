class Solution {
    public char findTheDifference(String s, String t) {
        int n = s.length();

        char[] arr1 = s.toCharArray();
        Arrays.sort(arr1);
        String s1 = new String(arr1);

        char[] arr2 = t.toCharArray();
        Arrays.sort(arr2);
        String t1 = new String(arr2);
        int i=0;
        while(i<arr1.length){
            if(arr1[i]!=arr2[i]){
                return arr2[i];
            }
            i++;
        }
        return arr2[arr2.length-1];

    }
}