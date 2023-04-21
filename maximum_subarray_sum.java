public class maximum_subarray_sum {
// Approach 1 brute force for loop (T.c = n^3)
    public static int maxsum1(int arr[], int n) {
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                int sum = 0;
                for(int k=i; k<=j; k++) {
                    sum = sum + arr[k];
                }
                if(sum > maxsum) {
                    maxsum = sum;
                }
            }
        }
        return maxsum;
    }

// Approach 2 prefix sum (T.c = n^2)

    public static int maxsum2(int arr[], int n) {
        
        int pfsum[] = new int[n];
        pfsum[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            pfsum[i] = pfsum[i-1] + arr[i];
        }
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                int sum = pfsum[j] - pfsum[i];
                if(sum > maxsum) {
                    maxsum = sum;
                } 
            }
        }
        
        return maxsum;
    }

    // Approach 3 kadene's algorithm (T.C = n)

        public static int maxsum3(int arr[], int n) {
            int maxsum = Integer.MIN_VALUE;
            int currSum = 0;
            for(int i=0; i<n; i++) {
                currSum = arr[i] + currSum;
                if(currSum < 0){
                    currSum = 0;
                }
                if(currSum > maxsum) {
                    maxsum = currSum;
                }
            }
            return maxsum;
        }

    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        System.out.println(maxsum3(arr, arr.length));
    }
}
