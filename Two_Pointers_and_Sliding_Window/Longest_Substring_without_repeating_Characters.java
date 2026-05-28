class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left = 0;
        int right = 0;
        int[] hash = new int[26];
        int maxF = 0;
        int maxLen = 0;
        while(right<n){
            int ch = s.charAt(right);
            hash[ch-'A']++;
            maxF = Math.max(maxF, hash[ch-'A']);
            while(right-left+1-maxF > k){
                hash[s.charAt(left)-'A']--;
                maxF = Math.max(maxF, hash[s.charAt(left)-'A']);
                left++;
            }
            if(right-left+1-maxF<=k){
                maxLen = Math.max(maxLen, right-left+1);
            }
            right++;
        }
        return maxLen;
    }
}