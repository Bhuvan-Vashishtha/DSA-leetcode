public class cyclic_sort{
    public static void main(String[] args) {
        int[] arr = {4,5,2,3,1};
        int n = arr.length;
        int i=0;
        while(i<n){
            int idx = arr[i] - 1;
            if(arr[i] != arr[idx]){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
            else{
                i++;
            }
        }
        print(arr);
    }
    static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}