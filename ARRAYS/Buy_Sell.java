// PROGRAM NO 11
// BUY & SELLS PROGRAM
     
package ARRAYS;

public class Buy_Sell {

 public static int getBuy_Sell(int sell_price[]){
    int buy_price = Integer.MAX_VALUE;
    int max_profit = 0;
    for(int i=0; i<sell_price.length; i++){
      if(buy_price < sell_price[i]){   // today profit
        int profit = sell_price[i] - buy_price;   // profit mil rha hai
        max_profit = Math.max(max_profit, profit);  // maxprofit are global profit hai
      }else{
        buy_price = sell_price[i];   // current price 
      }
    }
    return max_profit;

  }
  public static void main(String[] args) {
    int sell_price[] = {7,1,5,3,6,4};

    System.out.println("the maximum profit = " +getBuy_Sell(sell_price));
  }


    
}
