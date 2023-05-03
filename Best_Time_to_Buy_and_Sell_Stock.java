import java.util.ArrayList;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static int stockProfit(ArrayList<Integer> stockValues) {
        int buyPrice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0; i<stockValues.size(); i++) {
            if(buyPrice < stockValues.get(i)) {
                int profit = stockValues.get(i) - buyPrice;
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buyPrice = stockValues.get(i);
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(1);
        System.out.println(stockProfit(arr));
    }
}
