package string_leetcode;

public class Q2011_finalValueAfterOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {"--X","X++","X++"};
		System.out.println(finalsum(arr));

	}

	private static int finalsum(String[] arr) {
		// TODO Auto-generated method stub
		int val=0;
        for(int i=0;arr.length>i;i++){
            if(arr[i].charAt(1)=='+'){
            	val++;

            }else {
            	val--;
            }

        }
        return val;
	}

}
