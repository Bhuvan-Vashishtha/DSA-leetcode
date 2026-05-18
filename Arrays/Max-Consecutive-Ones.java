1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int currCount = 0;
4        int maxCount = 0;
5
6        for(int num : nums){
7            if(num == 1){
8                currCount++;
9            }
10            else{
11                currCount = 0;
12            }
13            maxCount = Math.max(currCount, maxCount);
14        }
15        return maxCount;
16    }
17}