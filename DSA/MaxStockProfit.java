 //you are given an array prices where prices[i] is prioce of a given stock on the ith day.you want to maximize your profit by  choosing a single day to  buy One stock and choosing a different day in the future to sell that stock. return the maximum profit  you can acheive from this transaction. if you vcannot achieve any profit, return 0 
 import java.util.Scanner;
 class StockProfit{
    
    static int MaxStockProfit(int SellingPrice[]) {
      int buyingPrice = Integer.MAX_VALUE;
      int maxProfit=0;
      int n=SellingPrice.length;

       for(int i=0;i<n;i++) {
            if(buyingPrice <  SellingPrice[i]) {
                int profit =  SellingPrice[i] - buyingPrice;
                if(profit > maxProfit) {
                    maxProfit =profit;
                  }
            } else {
            buyingPrice= SellingPrice[i];
            }
         }
     return maxProfit;
        }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of an Array = ");
         int n = sc.nextInt(); 
         int prices[] = new int[n];
      System.out.println("Enter " +n+ " Days Stock Selling Price");
         for(int i=0;i<n;i++) {
            prices[i] = sc.nextInt();
        }
        System.out.println("Maximum Profit of Stocks = " + MaxStockProfit(prices));
        sc.close();
 }
}