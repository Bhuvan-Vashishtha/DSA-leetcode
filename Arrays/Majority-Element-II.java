1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        int n = nums.length;
4        List<Integer> ls = new ArrayList<>();
5        for(int i=0;i<n;i++){
6            if(ls.size()==0 || ls.get(0) != nums[i]){
7                int cnt = 0;
8                for(int j=0;j<n;j++){
9                    if(nums[j]==nums[i]){
10                        cnt++;
11                    }
12                }
13                if(cnt>n/3){
14                    ls.add(nums[i]);
15                }
16                if(ls.size()==2) break;
17            }
18        }
19        return ls;
20    }
21}