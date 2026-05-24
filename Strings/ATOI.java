class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int digit = 0;
        int sign = 1;
        int i=0;
        if(s.length() == 0) return 0;
        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
            sign = s.charAt(0)=='-'? -1 : 1;
            i++;
        }
        while(i<s.length()){
            char ch = s.charAt(i);
            if(ch>'9' || ch<'0'){
                break;
            }
            if(digit > Integer.MAX_VALUE/10 || digit == Integer.MAX_VALUE/10 && ch-'0'>7){
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            digit = digit * 10 + ch-'0';
            i++;
        }
        return digit * sign;
    }
}