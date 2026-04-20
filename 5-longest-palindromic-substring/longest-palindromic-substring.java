// class Solution {
//     public String longestPalindrome(String s) {
//         StringBuilder sb =new StringBuilder();
//         int maxlen=0;

//         for(int i = 0; i<s.length()-1; i++){
//             for(int j = s.length()-1; j>i;j--){
//                 while(i<j){
//                     if(s.charAt(i)==s.charAt(j)){
//                         i++;
//                         j--;
//                     }
//                 }  
//             }
//         }
//         return a;
        
//     }
// }






class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        String a="";
        int maxlen=0;
        
        for(int i = 0; i<s.length()-1; i++){
            for(int j = s.length()-1; j>i;j--){
                if(s.charAt(i)==s.charAt(j)){
                    String str = s.substring(i,j+1);
                    StringBuilder sb = new StringBuilder(str);
                    String rev = sb.reverse().toString();
                    if(str.equals(rev)){
                        if(str.length()>a.length()){
                        a=str;
                        }
                    }
                    
                }  
            }
        }
        // return a;
        if(!a.isEmpty()){
            return a;
        }
        else{
            return a=a+s.charAt(0);
        }
        
    }
}