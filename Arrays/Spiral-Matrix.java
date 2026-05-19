1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        ArrayList<Integer> result = new ArrayList<>();
4        int m = matrix.length;
5        int n = matrix[0].length;
6        int left = 0;
7        int right = n-1;
8        int top = 0;
9        int bottom = m-1;
10
11   while(top<=bottom && left<=right) {
12    for(int i=left;i<=right;i++){
13        result.add(matrix[top][i]);
14        
15    }
16    top++;
17    for(int i=top;i<=bottom;i++){
18        result.add(matrix[i][right]);
19        
20    }
21    right--;
22    if(top<=bottom){
23        for(int i=right;i>=left;i--){
24        result.add(matrix[bottom][i]);
25        }
26         bottom--;
27    }
28   
29    if(left<=right){
30         for(int i=bottom;i>=top;i--){
31           result.add(matrix[i][left]);
32        
33         }
34          left++;
35        }
36      }
37      return result;
38    }
39}