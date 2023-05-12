import java.util.ArrayList;

public class Product_of_Array_Except_Self {
    public static ArrayList<Integer> selfProduct(ArrayList<Integer> nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.size();
        // left cumulative multiplicaion in ans array
        ans.add(nums.get(0));
        for(int i=1; i<n; i++) {
            ans.add(ans.get(i-1)*nums.get(i));
        }
        System.out.println(ans);
        int rightCuProduct = nums.get(n-1);
        ans.set(n-1, ans.get(n-2));
        for(int i=n-2; i>=1; i--) {
            ans.set(i, ans.get(i-1)*rightCuProduct);
            rightCuProduct = rightCuProduct * nums.get(i);
        }
        ans.set(0, rightCuProduct);
        return ans;
    }

    
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        // nums.add(1);
        // nums.add(0);
        // nums.add(1);
        // nums.add(3);
        // nums.add(2);
        // nums.add(1);
        // nums.add(2);
        // nums.add(1);

        System.out.println(selfProduct(nums));
    }
}
