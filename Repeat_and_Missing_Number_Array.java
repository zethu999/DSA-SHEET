import java.util.*;

public class Repeat_and_Missing_Number_Array {
    public static ArrayList<Integer> array(ArrayList<Integer> nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.size(); i++) {
            if(nums.get(Math.abs(nums.get(i))-1) < 0) {
                ans.add(Math.abs(nums.get(i)));
            }else {
                // nums.get(Math.abs(nums.get(i))) = -1*nums.get(Math.abs(nums.get(i)));
                nums.set(Math.abs(nums.get(i))-1, -1*nums.get(Math.abs(nums.get(i))-1));
            }
        }
        for(int i=0; i<nums.size(); i++) {
            if(nums.get(i)>0) {
                ans.add(i+1);
                break;
            }
        }
        return ans;
    }
        
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(array(arr));
    }
}
