package backtracking;

import java.util.Iterator;

public class sudoko_solver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		SudokuSolver(grid, 0, 0);

	}

	public static void SudokuSolver(int[][] grid, int row, int col) {
		// TODO Auto-generated method stub
		if (col == 9) {
			col = 0;
			row++;
		}
		if (row == 9) {
			display(grid);
			return;

		}
		if (grid[row][col] != 0) {
			SudokuSolver(grid, row, col+1);

		}else {
		for (int i = 0; i <=9; i++) {
			if (issafe(grid, row, col, i) == true) {
				grid[row][col] = i;
				SudokuSolver(grid, row, col+1);
				grid[row][col] = 0;
			}

		}
		}
	}

	public static void display(int[][] grid) {
		// TODO Auto-generated method stub
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static boolean issafe(int[][] grid, int row, int col, int i) {
		// col
		for (int j = 0; j < grid[0].length; j++) {
			if (grid[row][j] == i) {
				return false;
			}
		}
		// row
		for (int j2 = 0; j2 < grid[0].length; j2++) {
			if (grid[j2][col] == i) {
				return false;
			}
		}
		int r = row - row % 3;
		int c = col - col % 3;
		for (int k = r; k <r+ 3; k++) {
			for (int k2 = c; k2 < c+3; k2++) {
				if (grid[r][c] == i) {
					return false;
				}

			}
		}

		return true;

	}

}
