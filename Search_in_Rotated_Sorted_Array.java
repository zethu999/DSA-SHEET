/**
 * Search_in_Rotated_Sorted_Array
 */
import java.util.*;

 public class Search_in_Rotated_Sorted_Array {
    
    public static boolean search(ArrayList<Integer> arr, int target, int lp, int rp) {
        // using binary search
        int mid = (lp + rp)/2;
        if(lp>rp) {
            return false;
        }
        if(arr.get(mid) == target) {
            return true;
        }
        if(arr.get(lp) <= arr.get(mid)) {
            if(arr.get(lp) <= target && arr.get(mid) >= target) {
                return search(arr, target, lp, mid-1);
            }else{
                return search(arr, target, mid+1, rp);
            }
        }else{
            if(arr.get(mid) <= target && arr.get(rp) >= target) {
                return search(arr, target, mid+1, rp);
            }else{
                return search(arr, target, lp, mid-1);
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        System.out.println(search(arr, 10, 0, arr.size()-1));

    }

}