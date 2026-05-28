class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n= matrix.length;
        int m= matrix[0].length;

        int top=0;
        int right = m-1;
        int down=n-1;
        int left=0;

        List<Integer> ans = new ArrayList<>();
        while(top<=down && left<=right){
            for(int j=left;j<=right;j++){
                ans.add(matrix[top][j]);
            }
            top++;
            for(int i=top;i<=down;i++){
                ans.add(matrix[i][right]);
            }
            right--;

            if(top<= down){
                for(int j=right;j>=left;j--){
                    ans.add(matrix[down][j]);
                }
                down--;
            }

            if(left <= right){
                for(int i=down;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;


    }
}