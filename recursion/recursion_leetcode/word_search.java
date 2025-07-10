package recursion_leetcode;

public class word_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0)) {
					boolean ans = Search(board, i, j, word, 0);
					if (ans == true) {
						System.out.println(ans);
						return;
					}

				}

			}
		}
		System.out.println(false);

	}

	public static boolean Search(char[][] board, int i, int j, String word, int k) {
		// TODO Auto-generated method stub
		if (k == word.length()) {

			return true;
		}
		if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || word.charAt(k) != board[i][j]) {
			return false;
		}
		board[i][j] = '*';
		int[] r = { -1, 0, 1, 0 };
		int[] c = { 0, -1, 0, 1 };
		for (int u = 0; u < c.length; u++) {
			boolean ans = Search(board, i + r[u], j + c[u], word, k + 1);
			if (ans == true) {
				return true;
			}
		}
		board[i][j] = word.charAt(k);
		return false;
	}

}
