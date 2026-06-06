1class Solution {
2    
3    public int numSubseq(int[] nums, int target) {
4        int count = 0;
5        int n = nums.length;
6        Arrays.sort(nums);
7        int[] pow = new int[n];
8        pow[0] = 1;
9        int MOD = 1000000007;
10        for(int i=1;i<n;i++){
11            pow[i] = (int)(pow[i-1]*2L) %MOD;
12        }
13        int i=0;
14        int j = nums.length-1;
15        while(i<=j){
16            if(nums[i]+nums[j]<=target){
17                count = (count + pow[j-i])%MOD;
18                i++;
19            }
20            else{
21                j--;
22            }
23        }
24        return count % MOD;
25    }
26}