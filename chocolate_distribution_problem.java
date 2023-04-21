import java.util.Arrays;

public class chocolate_distribution_problem {
    public static int choclate(int arr[], int n, int m) {
        if(m == 0 && n == 0) {
            return arr[0];
        }
        if(n<m) {
            return -1;
        }
        Arrays.sort(arr);
        int min_diff = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < min_diff)
                min_diff = diff;
        }
        return min_diff;
    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
        System.out.println(choclate(arr, arr.length, 5));
    }
}
