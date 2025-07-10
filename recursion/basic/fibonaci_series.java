package basic;

public class fibonaci_series {
	
	
		  public static void main(String args[]) {
		    int fib_len = 9;

		    System.out.print("Fibonacci Series of " + fib_len + " numbers is: \n");

		   
		      System.out.print(fibRecursion(9) + " ");
		    
		  }
		

	
		  public static int fibRecursion(int count) {
		    if (count == 0) {
		      return 0;
		    } 

		    if (count == 1 || count == 2) {
		      return 1;
		    } 

		    int f1=fibRecursion(count-1);
		    		 int f2=fibRecursion(count-2);
		    		 return f1+f2;
		  }



}
