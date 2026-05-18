1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int n = nums.length;
4        int[] arr = new int[n];
5        int pos = 0, neg = 1;
6
7        for(int i=0;i<n;i++){
8            if(nums[i]>=0){
9                arr[pos] = nums[i];
10                pos += 2;
11            }
12            else{
13                arr[neg] = nums[i];
14                neg += 2;
15            }
16        }
17        return arr;
18    }
19}