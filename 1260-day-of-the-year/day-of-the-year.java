class Solution {
    public int dayOfYear(String date) {
        String[] parts = date.split("-");
        int y = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int d = Integer.parseInt(parts[2]);
        int count=0;
        for(int i=1;i<m;i++){
            if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12){
                count+=31;
            }
            else if(i==4 || i==6 || i==9 || i==11){
                count+=30;
            }
            if(i==2){
                if(y%4==0 && y%100!=0 || y%400==0){
                    count+=29;
                }
                else{
                    count+=28;
                }
            }
            
        }
        return count+d;
    }
}