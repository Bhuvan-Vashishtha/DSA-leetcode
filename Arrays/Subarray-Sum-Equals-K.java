1// class Solution {
2//     public int subarraySum(int[] nums, int k) {
3//         HashMap<Integer, Integer> map = new HashMap<>();
4//         map.put(0,1);
5//         int count = 0;
6//         int preSum = 0;
7//         for(int i=0;i<nums.length;i++){
8//             preSum+=nums[i];
9//             int remove = preSum - k;
10//             count+=map.get(remove);
11//             if(map.containsKey(preSum)){
12//                map.put(preSum, map.get(preSum)+1);
13//             }
14//             else{
15//                 map.put(preSum,1);
16//             }
17//         }
18//         return count;
19//     }
20// }
21class Solution {
22    public int subarraySum(int[] nums, int k) {
23        HashMap<Integer, Integer> map = new HashMap<>();
24        map.put(0, 1); // base case
25
26        int count = 0;
27        int preSum = 0;
28
29        for (int i = 0; i < nums.length; i++) {
30            preSum += nums[i];
31
32            int remove = preSum - k;
33            count += map.getOrDefault(remove, 0);
34
35            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
36        }
37
38        return count;
39    }
40}
41