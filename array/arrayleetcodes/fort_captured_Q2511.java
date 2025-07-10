package arrayleetcodes;

public class fort_captured_Q2511 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 0, 0, -1, 0, 0, 0, 0, 1 };
		System.out.println(captureForts(arr));

	}

	   public static int captureForts(int[] forts) {
	        int prev=-2;
	        int x=0;
	        int max=0;
	        for(int i=0;i<forts.length;i++){
	            if(forts[i]==1||forts[i]==-1){
	                if(prev==-2){
	                    prev=forts[i];
	                    x=i;
	                }
	                else if(prev!=forts[i]){
	                    max=Math.max(max,i-x-1);
	                    prev=forts[i];
	                    x=i;
	                }
	                else{
	                    x=i;
	                }
	            }
	        }
	        return max;
	    }
}
