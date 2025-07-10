package que_impilimentation;

public class que {

	protected int[] arr;
	protected int front = 0;
	private int size = 0;

	public que() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
	}

	public que(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
	}

	public void Enque(int item) throws Exception {
		if (isfull()) {
			throw new Exception("que full hai bhai");

		}
		int idx = (front + size) % arr.length;
		arr[idx] = item;
		size++;

	}

	public int Deque() throws Exception {
		if (Isempty()) {
			throw new Exception("que empty hai bhai");

		}
		int rv = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return rv;
	}

	public int getfront() throws Exception {
		if (Isempty()) {
			throw new Exception("que empty hai bhai");
		}
		return arr[front];
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[(front + i) % arr.length] + " ");

		}
		System.out.println();
	}

	public int size() {
		return size;
	}

	public boolean isfull() {
		return size == arr.length;
	}

	public boolean Isempty() {
		return size == 0;
	}

}
