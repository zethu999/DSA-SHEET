
/**
 * Trapping_Rain_Water
 */
import java.util.*;

public class Trapping_Rain_Water {
    public static int water(ArrayList<Integer> heights) {
        int n = heights.size();
        int trappedWater = 0;

        if (n == 1 || n == 2) {
            return trappedWater;
        }
        // left Auxilary array
        ArrayList<Integer> leftMax = new ArrayList<>();
        leftMax.add(heights.get(0));
        for (int i = 1; i < n; i++) {
            if (heights.get(i) > leftMax.get(i - 1)) {
                leftMax.add(i, heights.get(i));
            } else {
                leftMax.add(i, leftMax.get(i - 1));
            }
        }

        System.out.println(leftMax);

        // rigth Auxilary array
        ArrayList<Integer> rightMax = new ArrayList<>(Collections.nCopies(n, 0));
        rightMax.set(n - 1, heights.get(n - 1));
        for (int i = n - 2; i >= 0; i--) {
            if (heights.get(i) > rightMax.get(i + 1)) {
                rightMax.set(i, heights.get(i));
            } else {
                rightMax.set(i, rightMax.get(i + 1));
            }
        }
         
        System.out.println(rightMax);

        for (int i = 0; i < n; i++) {
            int waterHeight = Math.min(leftMax.get(i), rightMax.get(i));
            trappedWater = trappedWater + ((waterHeight - heights.get(i)) * 1);
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> heights = new ArrayList<>();
        heights.add(0);
        heights.add(1);
        heights.add(0);
        heights.add(2);
        heights.add(1);
        heights.add(0);
        heights.add(1);
        heights.add(3);
        heights.add(2);
        heights.add(1);
        heights.add(2);
        heights.add(1);

        System.out.println(water(heights));
    }

}