package que_impilimentation;

public class que_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		que q = new que();
		q.Enque(10);
		q.Enque(20);
		q.Enque(30);
		q.Enque(40);
		q.display();
		System.out.println(q.Deque());
		System.out.println(q.Deque());
		q.Enque(50);
		q.Enque(60);
		q.display();

	}

}
