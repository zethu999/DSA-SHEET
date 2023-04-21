public class reverse_an_array {
    public static void reverse(int arr[], int low, int high) {
        while(low<=high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++; high--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,1,4,7,8,2};
        reverse(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
