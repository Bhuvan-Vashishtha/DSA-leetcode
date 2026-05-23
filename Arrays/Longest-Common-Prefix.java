1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        if(strs.length<=1) return strs[0];
4        Arrays.sort(strs);
5        String str1 = strs[0];
6        String str2 = strs[strs.length-1];
7        StringBuilder sb = new StringBuilder();
8        for(int i=0;i<str1.length();i++){
9            if(str1.charAt(i) == str2.charAt(i)){
10                sb.append(str1.charAt(i));
11            }
12            else{
13                break;
14            }
15        }
16        return sb.toString();
17    }
18}