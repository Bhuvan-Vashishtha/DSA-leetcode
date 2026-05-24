class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] chars = new int[26];
        int n = s.length();
        for(int i=0;i<n;i++){
            chars[s.charAt(i)-'a']++;
            chars[t.charAt(i)-'a']--;
        }
        for(int value : chars){
            if(value != 0) return false;
        }
        return true;
    }
}