
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        sS(arr, result, 0, 0);
        return result;
    }
    static void sS(int[] arr, ArrayList<Integer> list, int i, int sum){
        if(i == arr.length){
            list.add(sum);
            return;
        }
        sS(arr, list, i+1, sum + arr[i]);
        sS(arr, list, i+1, sum);
    }
}