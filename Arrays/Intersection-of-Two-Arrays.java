1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        Set<Integer> set1 = new HashSet<>();
4        Set<Integer> result = new HashSet<>();
5
6        for(int num : nums1){
7            set1.add(num);
8        }
9        for(int num : nums2){
10            if(set1.contains(num)){
11                result.add(num);
12            }
13        }
14        int[] arr = new int[result.size()];
15        int i=0;
16        for(int num : result){
17            arr[i++] = num;
18        }
19        return arr;
20    }
21}