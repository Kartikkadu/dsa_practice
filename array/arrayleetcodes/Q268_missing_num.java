package arrayleetcodes;

public class Q268_missing_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,3};
		System.out.println(missing(arr));
		

	}
	public static int missing(int[] arr) {
		int i=0;
		int j=1;
		int sum=0;
		int og=0;
		while(i<arr.length) {
		sum=sum+arr[i];
		og=og+j;
		j++;
		i++;
		}
		return og-sum;
	}

}
