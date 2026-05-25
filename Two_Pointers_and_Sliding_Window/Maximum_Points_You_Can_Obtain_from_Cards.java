class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        if(n == k){
            for(int i=0;i<n;i++){
                sum += cardPoints[i];
            }
            return sum;
        }
        int lSum = 0;
        int rSum = 0;
        int rightIdx = n-1;
        for(int i=0;i<k;i++){
            lSum += cardPoints[i];
            sum = lSum;
        } 

        for(int i=k-1;i>=0;i--){
            lSum -= cardPoints[i];
            rSum += cardPoints[rightIdx];
            rightIdx--;
            sum = Math.max(sum, lSum+rSum);
        }
        return sum;
    }
}