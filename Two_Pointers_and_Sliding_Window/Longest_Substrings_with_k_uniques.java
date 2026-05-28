class Solution {
    public int longestKSubstr(String s, int k) {
        int left = 0;
        int right = 0;
        int maxLen = -1;
        HashMap<Character,Integer> map = new HashMap<>();
        
        int n = s.length();
        
        while(right<n){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right),0)+1);
            while(map.size()>k){
                map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)-1);
                if(map.get(s.charAt(left)) == 0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
            if(map.size()==k){
                maxLen = Math.max(maxLen, right-left+1);
            }
            right++;
        }
        return maxLen;
    }
}