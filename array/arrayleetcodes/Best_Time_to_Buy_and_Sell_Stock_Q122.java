package arrayleetcodes;

public class Best_Time_to_Buy_and_Sell_Stock_Q122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxp(arr));

	}

	public static int maxp(int[] arr) {
		int profit = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1]) {
				profit += arr[i] - arr[i - 1];
			}

		}

		return profit;

	}

}
