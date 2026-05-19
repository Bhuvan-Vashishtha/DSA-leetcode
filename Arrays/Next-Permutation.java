1class Solution {
2    public void nextPermutation(int[] nums) {
3        int n = nums.length;
4        int idx = -1;
5        for(int i=n-1;i>0;i--){
6            if(nums[i] > nums[i-1]){
7                idx = i-1;
8                break;
9            }
10        }
11        if(idx == -1){
12            reverse(nums, 0, n-1);
13            return;
14        }
15
16        for(int i=n-1;i>idx;i--){
17            if(nums[i]>nums[idx]){
18                swap(nums, idx, i);
19                reverse(nums, idx+1, n-1);
20                break;
21            }
22        }
23
24    }
25    static void swap(int[] arr, int i, int j){
26        int temp = arr[i];
27        arr[i] = arr[j];
28        arr[j] = temp;
29    }
30    static void reverse(int[] arr, int i, int j){
31        while(i<j){
32            swap(arr, i, j);
33            i++;
34            j--;
35        }
36    }
37}