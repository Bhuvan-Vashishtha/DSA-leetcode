1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> result = new ArrayList<>();
4        for(int i=1;i<=numRows;i++){
5            result.add(genRow(i));
6        }
7        return result;
8    }
9    static List<Integer> genRow(int row){
10        ArrayList<Integer> ans = new ArrayList<>();
11        int res = 1;
12        ans.add(1);
13        for(int i=1;i<row;i++){
14            res = res*(row-i);
15            res = res/i;
16            ans.add(res);
17        }
18        return ans;
19    }
20}