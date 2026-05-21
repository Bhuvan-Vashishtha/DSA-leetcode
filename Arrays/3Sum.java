1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        int n = nums.length;
5        Arrays.sort(nums);
6        if(nums[0]>0) return result;
7
8        for(int i=0;i<n-2;i++){
9            int left = i+1;
10            int right = n-1;
11            if(i>0 && nums[i] == nums[i-1]) continue;
12            while(left<right){
13                int sum = nums[i]+nums[left]+nums[right];
14                if(sum == 0){
15                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
16                    left++;
17                    right--;
18                    while(left<right && nums[left] == nums[left-1]) left++;
19                    while(left<right && nums[right] == nums[right+1]) right--;
20                }
21                else if(sum<0){
22                    left++;
23                }
24                else{
25                    right--;
26                }
27            }
28        }  
29        return result;
30    }
31}