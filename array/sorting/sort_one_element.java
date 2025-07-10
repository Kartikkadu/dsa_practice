package sorting;

public class sort_one_element {

	public static void main(String[] args) {
		int[]arr= {1,3,4,5,6,7,2};
		int item=arr.length-1;
		sort(arr,item);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
		
		
		
	}
	public static int[] sort(int[]arr,int item) {
		int i=arr.length-2;
		
		while (arr[item]<arr[i]) {
		int	temp=arr[i];
		arr[i]=arr[item];
		arr[item]=temp;
		i--;
		item--;
			
		}
		return arr;
		
	}

}