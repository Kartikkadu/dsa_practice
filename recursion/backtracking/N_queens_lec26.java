package backtracking;


public class N_queens_lec26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[][] board = new boolean[n][n];
		queen(board, n, 0);

	}

	public static void queen(boolean[][] board, int tq, int row) {
		if (tq == 0) {
			display(board, 4);
			System.out.println();
			return;
		}
		for (int coll = 0; coll < board[0].length; coll++) {
			if (issafe(board, row, coll) == true) {
				board[row][coll] = true;
				queen(board, tq-1, row+1);
				board[row][coll] = false;
			}
		}

	}

	public static void display(boolean[][] board, int n) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static Boolean issafe(boolean[][] board, int row, int col) {
		
		int r = row;	
		while (r >= 0) {
			if (board[r][col] == true) {
				return false;
			}
			r--;
		}
		
		r= row;
		int c = col;
		// left diagonal
		while (r >= 0 && c >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c--;
		}
		// up
	
		r=row;
		c=col;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c++;
		}
		return true;

	}

}
