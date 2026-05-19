1class Solution {
2    public boolean canReach(int[] arr, int start) {
3        int n = arr.length;
4        boolean[] visited = new boolean[n];
5        return cR(arr, start, visited);
6    }
7    static boolean cR(int[] arr, int start, boolean[] visited){
8        if(start < 0 || start >= arr.length) return false;
9        if(arr[start] == 0) return true;
10        if(visited[start]) return false;
11
12        visited[start] = true;
13
14        return cR(arr, start+arr[start], visited) || cR(arr, start-arr[start], visited);
15    }
16}