1class Solution {
2    public int findDuplicate(int[] nums) {
3        int slow = 0;
4        int fast = 0;
5        do{
6            slow = nums[slow];
7            fast = nums[nums[fast]];
8        }
9        while(slow != fast);
10        int k=0;
11        while(slow != k){
12            slow = nums[slow];
13            k = nums[k];
14        }
15        return slow;
16    }
17}