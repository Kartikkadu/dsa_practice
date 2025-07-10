package arrayleetcodes;

public class third_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 1, 6, 7, 5 };
		System.out.println(thirdmax(nums));

	}

	public static long thirdmax(int[] nums) {
		long max = Long.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			max = Math.max(max, nums[i]);

		}

		long max2 = Long.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != max) {
				max2 = Math.max(max2, nums[i]);
			}

		}
		long max3 = Long.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != max && nums[i] != max2) {
				max3 = Math.max(max3, nums[i]);

			}

		}
		if (max3 != 0) {
			return max3;
		}
		return max;

	}

}
