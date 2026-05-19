1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5        
6        boolean firstRowZero = false;
7        boolean firstColZero = false;
8
9        for(int j=0;j<n;j++){
10            if(matrix[0][j] == 0){
11                firstRowZero = true;
12                break;
13            }
14        }
15        for(int i=0;i<m;i++){
16            if(matrix[i][0] == 0){
17                firstColZero = true;
18                break;
19            }
20        }
21        for(int i=1;i<m;i++){
22            for(int j=1;j<n;j++){
23                if(matrix[i][j] == 0){
24                    matrix[0][j] = 0;
25                    matrix[i][0] = 0;
26                }
27            }
28        }
29        for(int i=1;i<m;i++){
30            for(int j=1;j<n;j++){
31                if(matrix[0][j] == 0 || matrix[i][0] == 0){
32                    matrix[i][j] = 0;               
33                }
34            }
35        }
36        if(firstRowZero){
37            for(int j=0;j<n;j++){
38                matrix[0][j] = 0;
39            }
40        }
41        if(firstColZero){
42            for(int i=0;i<m;i++){
43                matrix[i][0] = 0;
44            }
45        }
46    }
47}