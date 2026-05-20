1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        boolean firstRowZero = false;
7        boolean firstColZero = false;
8
9        //check first row and first col is zero or not
10        for(int i=0;i<n;i++){
11            if(matrix[0][i] == 0){
12                firstRowZero = true;
13                break;
14            }
15        }
16        for(int i=0;i<m;i++){
17            if(matrix[i][0] == 0){
18                firstColZero = true;
19                break;
20            }
21        }
22        //mark zeroes
23        for(int i=1;i<m;i++){
24            for(int j=1;j<n;j++){
25                if(matrix[i][j] == 0){
26                    matrix[0][j] = 0;
27                    matrix[i][0] = 0;
28                }
29            }
30        }
31        for(int i=1;i<m;i++){
32            for(int j=1;j<n;j++){
33                if(matrix[0][j] == 0 || matrix[i][0] == 0){
34                    matrix[i][j] = 0;
35                }
36            }
37        }
38        if(firstRowZero){
39            for(int i=0;i<n;i++){
40            matrix[0][i] = 0;
41        }
42        }
43        if(firstColZero){
44            for(int i=0;i<m;i++){
45            matrix[i][0] = 0;
46        }
47        }
48
49    }
50}