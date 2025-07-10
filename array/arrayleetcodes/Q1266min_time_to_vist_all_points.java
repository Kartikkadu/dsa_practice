package arrayleetcodes;

public class Q1266min_time_to_vist_all_points {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] points= {{1,1},{3,4},{-1,0}};
		System.out.println(ans(points));

	}

	private static int ans(int[][] points) {
		// TODO Auto-generated method stub
		
		int vis=points.length;
		int i=1;
		int j=0;
		int ans=0;
		while(i<vis) {
			int x1 = points[j][0];
			int y1 = points[j][1];
			int x2 = points[i][0];
			int y2 = points[i][1];
			ans=Math.max(Math.abs(x2-x1), Math.abs(y2-y1))+ans;
			j++;
			i++;
		}return ans;
	}

}
