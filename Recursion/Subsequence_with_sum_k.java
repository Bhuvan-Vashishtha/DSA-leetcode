class Solution {
    public boolean checkSubsequenceSum(int[] arr, int k) {
        return css(arr, k, 0);
    }
    static boolean css(int[] arr, int k, int idx){
        if(k == 0){
            return true;
        }
        if(k<0 || idx == arr.length){
            return false;
        }
        return css(arr, k-arr[idx], idx+1) || css(arr, k, idx+1);
    }
}