
/*  Maximum and minimum of an array using minimum number of comparisons.
Given an array of size N. The task is to find the maximum and the minimum element of the array 
using the minimum number of comparisons.
*/

// Brute force method (Linear search)
import java.util.*;

public class Minimum_number_of_comparisons {
    public static class pair {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
    }

    public static pair getMinMax(int arr[], int n) {
        pair minmax = new pair();

        if(n == 1) {
            minmax.min = arr[0];
            minmax.max = arr[0];
            return minmax;
        }
        
        for (int i=1; i<arr.length; i++) {
            if(arr[i] < minmax.min) {
                minmax.min = arr[i];
            }else if(arr[i] > minmax.max) {
                minmax.max = arr[i];
            }
        }
        return minmax;
    }
// Binary search approach.
    public static pair getMinMax_bin(int arr[], int low, int high)
    {
        pair minmax = new pair();
        pair mml = new pair();
        pair mmr = new pair();
        int mid;
  
        if (low == high) {
            minmax.max = arr[low];
            minmax.min = arr[low];
            return minmax;
        }
  
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                minmax.max = arr[low];
                minmax.min = arr[high];
            }
            else {
                minmax.max = arr[high];
                minmax.min = arr[low];
            }
            return minmax;
        }
  
        mid = (low + high) / 2;
        mml = getMinMax_bin(arr, low, mid);
        mmr = getMinMax_bin(arr, mid + 1, high);
  
        if (mml.min < mmr.min) {
            minmax.min = mml.min;
        }
        else {
            minmax.min = mmr.min;
        }
  
        if (mml.max > mmr.max) {
            minmax.max = mml.max;
        }
        else {
            minmax.max = mmr.max;
        }
  
        return minmax;
    }
    public static void main(String[] args) {
        int arr[] = {5,1,4,7,8,2,9,1,2,4,7,5,6,34};
        pair minmax = new pair();
        minmax = getMinMax_bin(arr, 0, arr.length-1);
        System.out.println(minmax.min);
        System.out.println(minmax.max);
    }
}