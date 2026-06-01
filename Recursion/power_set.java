// User function Template for Java

class Solution {
    public List<String> AllPossibleStrings(String s) {
        List<String> result = new ArrayList<>();
        aps(s, result, "", 0);
        result.remove("");
        Collections.sort(result);
        return result;
    }
    static void aps(String s, List<String> list, String str, int i){
        if(i == s.length()){
            list.add(str);
            return;
        }
        aps(s, list, str+s.charAt(i), i+1);
        aps(s, list, str, i+1);
    }
}