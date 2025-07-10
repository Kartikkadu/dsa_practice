package arraybase;

import java.util.Scanner;

public class no_of_sunday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String day = sc.next();
		String[] days = { "sunday", "monday", "tuesday", "wednasday", "thursday", "friday", "saturday" };
		int span = sc.nextInt();
		int start = 0;
		for (int i = 0; i < days.length; i++) {
			if ((days[i].equalsIgnoreCase(day))) {
				start = i;
				break;

			}
			int ans = 0;
			for (int j = 0; j < span; j++) {
				if (days[(start + j) % 7].equals("sunday")) {
					ans++;
				}
			}
			System.out.println(ans);
		}

	}

}
