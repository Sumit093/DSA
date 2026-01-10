class Solution {
    public String reverseWords(String s) {
        String a = s.trim();
        String[] parts = a.split("\\s+");

        int i=0,j=parts.length-1;
        while(i<j){
            String temp = parts[i];
            parts[i] = parts[j];
            parts[j] = temp;
            i++;
            j--;
        }
        String ans = String.join(" ",parts);
        return ans;


    }
}