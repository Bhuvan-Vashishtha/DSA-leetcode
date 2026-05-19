1class Solution {
2    public void rotate(int[][] matrix) {
3        int n = matrix.length;
4        for(int i=0;i<n;i++){
5            for(int j=i+1;j<n;j++){
6                int temp = matrix[i][j];
7                matrix[i][j] = matrix[j][i];
8                matrix[j][i] = temp;
9            }
10        }
11        for(int[] row : matrix){
12            reverse(row);
13        }
14    }
15    static void reverse(int[] arr){
16        int i=0, j=arr.length-1;
17        while(i<j){
18            int temp = arr[i];
19            arr[i] = arr[j];
20            arr[j] = temp;
21            i++;
22            j--;
23        }
24    }
25}