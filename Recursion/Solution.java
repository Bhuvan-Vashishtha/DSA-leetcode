class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        if(n == 1) return 1;
        int left = towerOfHanoi(n-1, from, aux, to);
        int right = towerOfHanoi(n-1, to, from, aux);
        return left+right+1;
    }
}
