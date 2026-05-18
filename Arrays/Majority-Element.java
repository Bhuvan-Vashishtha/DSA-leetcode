1class Solution {
2    public int majorityElement(int[] nums) {
3        int n = nums.length;
4        int count = 0;
5        int el = 0;
6        for(int i=0;i<n;i++){
7            if(count == 0){
8                el = nums[i];
9            }
10            if(nums[i] == el){
11                count++;
12            }
13            else{
14                count--;
15            }
16        }
17        return el;
18    }
19}