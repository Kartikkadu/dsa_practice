package arrayleetcodes;

public class Best_Time_to_Buy_and_Sell_Stock_Q121 {

	public static void main(String[] args) {

	     int[]arr= {7,1,5,3,6,4};
	     System.out.println(maxp(arr));
	}
	public static int maxp(int[]arr) {
//		int bd;
//		int sd;
//		int profit=0;
//		for (int i = 0; i < arr.length-1; i++) {         //solution but TLE
//			for (int j = i+1; j < arr.length; j++) {
//				bd=arr[i];
//				sd=arr[j];
//				if(sd>bd) {
//				profit=Math.max(profit, (sd-bd));
//				}
//				
//			}
//		}return profit;
         int maxprofit=0;
         int minprice=arr[0];
         for (int i = 1; i < arr.length; i++) {
        	 maxprofit=Math.max(maxprofit, arr[i]-minprice);
        	 minprice=Math.min(minprice, arr[i]);
			
		}
         return maxprofit;
		
		
	}

}
