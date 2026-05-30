// User function Template for Java

class Solution {
    ArrayList<String> NBitBinary(int N) {
        ArrayList<String> result = new ArrayList<>();
        helper(result, 0, 0, "", N);
        return result;
    }
    static void helper(ArrayList<String> result, int ones, int zeroes, String s, int n){
        if(s.length() == n){
            result.add(s);
            return;
        }
        if(ones<n){
            helper(result, ones+1, zeroes, s+"1", n);
        }
        if(zeroes<ones){
            helper(result, ones, zeroes+1, s+"0", n);
        }
    }
}