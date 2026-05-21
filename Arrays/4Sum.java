1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        List<List<Integer>> result = new ArrayList<>();
4        int n = nums.length;
5        Arrays.sort(nums);
6        for(int i=0;i<n-3;i++){
7            if(i>0 && nums[i] == nums[i-1]) continue;
8            for(int j=i+1;j<n-2;j++){
9                if(j>i+1 && nums[j] == nums[j-1]) continue;
10                int left = j+1;
11                int right = n-1;
12                while(left<right){
13                    long sum = (long)nums[left]+(long)nums[right]+(long)nums[i]+(long)nums[j];
14                    if(sum == target){
15                        result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
16                        left++;
17                        right--;
18                        while(left<right && nums[left] == nums[left-1]) left++;
19                        while(left<right && nums[right] == nums[right+1]) right--;
20                    }
21                    else if(sum < target) left++;
22                    else right--;
23                }
24            }
25        }
26        return result;
27    }
28}