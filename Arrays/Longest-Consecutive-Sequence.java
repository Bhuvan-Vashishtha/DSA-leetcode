1class Solution {
2    public int longestConsecutive(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4        for(int num:nums){
5            set.add(num);
6        }
7        int longest = 0;
8        for(int num : set){
9            if(!set.contains(num-1)){
10                int currLength = 1;
11                int currNum = num;
12
13                while(set.contains(currNum+1)){
14                    currLength++;
15                    currNum++;
16                }
17                longest = Math.max(longest, currLength);
18            }
19        }
20        return longest;
21    }
22}