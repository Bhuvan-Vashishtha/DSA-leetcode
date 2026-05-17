1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        Arrays.sort(nums1);
4        Arrays.sort(nums2);
5
6        Set<Integer> set = new HashSet<>();
7
8        int i = 0, j = 0;
9
10        while(i < nums1.length && j < nums2.length) {
11
12            if(i > 0 && nums1[i] == nums1[i - 1]) {
13                i++;
14                continue;
15            }
16
17            if(nums1[i] == nums2[j]) {
18                set.add(nums1[i]);
19                i++;
20                j++;
21            }
22            else if(nums1[i] < nums2[j]) {
23                i++;
24            }
25            else {
26                j++;
27            }
28        }
29
30        int[] arr = new int[set.size()];
31        int k = 0;
32
33        for(int num : set) {
34            arr[k++] = num;
35        }
36
37        return arr;
38    }
39}