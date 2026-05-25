class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int left = 0;
        int n = nums.length;
        int prod = 1;
        int count = 0;
        for(int right=0;right<n;right++){
            prod *= nums[right];
            while(prod>=k){
                prod /= nums[left];
                left++;
            }
            if(prod<k){
                count += right-left+1;
            }
        }
        return count;
    }
}