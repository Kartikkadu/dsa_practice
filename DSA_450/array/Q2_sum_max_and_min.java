package array;

import java.util.Arrays;

public class Q2_sum_max_and_min {

	 public static void main(String[] args) {
	        int[] arr = {5, 7, 2, 1, 8, 3, 4};
	        int[] result = findMinMax(arr, 0, arr.length - 1);
	        int sum = result[0] + result[1]; // result[0] = min, result[1] = max
	        System.out.println("Sum of Min and Max: " + sum);
	    }

	    // Returns [min, max]
	    public static int[] findMinMax(int[] arr, int low, int high) {
	        // Base case: only one element
	        if (low == high) {
	            return new int[]{arr[low], arr[low]};
	        }

	        // Base case: two elements
	        if (high == low + 1) {
	            int min = Math.min(arr[low], arr[high]);
	            int max = Math.max(arr[low], arr[high]);
	            return new int[]{min, max};
	        }

	        // Divide
	        int mid = (low + high) / 2;
	        int[] left = findMinMax(arr, low, mid);
	        int[] right = findMinMax(arr, mid + 1, high);

	        // Combine results
	        int overallMin = Math.min(left[0], right[0]);
	        int overallMax = Math.max(left[1], right[1]);

	        return new int[]{overallMin, overallMax};
	    }

}
