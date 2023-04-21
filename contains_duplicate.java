/* 
Given an integer array nums, return true if any value appears at least twice in the array, 
and return false if every element is distinct. 
*/

import java.util.*;
public class contains_duplicate {
    
    // Approach-1 sort and compare
    public static boolean duplicates(int arr[], int n) {
        Arrays.sort(arr);
        for(int i=1; i<arr.length; i++) {
            if(arr[i]==arr[i-1]) {
                return true;
            }
        }
        return false;
    }
    // Approach-2 Hashmap
    public static boolean duplicates2(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++) {
            if (map.containsKey(arr[i])) {
                return true;
            }
            map.put(arr[i], 1);
        }
        return false;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        System.out.println(duplicates2(arr, arr.length));
    }
}