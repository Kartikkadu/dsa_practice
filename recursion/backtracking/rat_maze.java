package backtracking;

import java.util.Scanner;

public class rat_maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				maze[i][j] = s.charAt(j);
			}
		}
		int[][] ans = new int[n][m];
		MazePath(maze, 0, 0, ans);
		if (val==false) {
			System.out.println("no path found");
		}
	

	}static boolean val=false;

	public static void MazePath(char[][] maze, int i, int j, int[][] ans) {
		// TODO Auto-generated method stub
		if (i < 0 || j < 0 || j >= maze[0].length || i >= maze.length || maze[i][j] == 'X') {
			return;
		}
		if (j == maze[0].length - 1 && i == maze.length - 1) {
			ans[i][j] = 1;
			display(ans);
			val=true;

			return;
		}
		maze[i][j] = 'X';
		ans[i][j] = 1;

		MazePath(maze, i - 1, j, ans);
		MazePath(maze, i, j - 1, ans);
		MazePath(maze, i + 1, j, ans);
		MazePath(maze, i, j + 1, ans);
		maze[i][j] = 'O';
		ans[i][j] = 0;

	}

	public static void display(int[][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {

				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

}
