package arraybase;

public class patter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//patern 1
		System.out.println("(1)");
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("#");
				
			}
			System.out.println();
			
		}
		//pattern 2
		System.out.println("(2)");
		System.out.println();
		int rows=5;
		for (int i = 1; i <= rows; i++) {
           
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println(); 
        }
		//pattern 3
		System.out.println("(3)");
		System.out.println();
		for (int i = 1; i <=5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
				
			}
			System.out.println();
			
		}
//pattern 4
		System.out.println("(4)");
		System.out.println();
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
		//pattern 5
		System.out.println("(5)");
		System.out.println();
		for (int i = 1; i <= rows; i++) {
	           
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(k);
            }

            System.out.println(); 
        }
		//pattern 6
		System.out.println("(6)");
		System.out.println();
		int x=9;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(x--);
				
			}
			System.out.println();
		}
	}

}
