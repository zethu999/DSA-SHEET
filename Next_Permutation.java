import java.util.ArrayList;

import java.util.*;
public class Next_Permutation {
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> nums) {
        int n = nums.size();
        // from back to front, find the first num < nums[i + 1]
        int i;
        for (i = n - 2; i >= 0; --i)
            if (nums.get(i) < nums.get(i + 1))
                break;

        // from back to front, find the first num > nums[i], swap it with nums[i]
        if (i >= 0)
            for (int j = n - 1; j > i; --j)
                if (nums.get(j) > nums.get(i)) {
                    Collections.swap(nums, i, j);
                    break;
                }

        // reverse nums[i + 1..n - 1]
        Collections.reverse(nums.subList(i + 1, n));
        return nums;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(nextPermutation(arr));
    }
}
