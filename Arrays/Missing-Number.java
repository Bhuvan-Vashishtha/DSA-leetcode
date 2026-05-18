1class Solution {
2    public int missingNumber(int[] nums) {
3        int n = nums.length+1;
4        int xor1 = 0;
5        int xor2 = 0;
6        for(int i=0;i<n;i++){
7            xor1 ^= i;
8        }
9        for(int num : nums){
10            xor2 ^= num;
11        }
12
13        return xor1 ^ xor2;
14    }
15}