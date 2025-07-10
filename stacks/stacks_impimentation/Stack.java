package stacks_impimentation;

public class Stack {
	protected int[] arr;
	private int idx = -1;

	public Stack() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
	}

	public Stack(int n) {
		arr = new int[n];

	}

	public void push(int item) throws Exception {
		if (Isfull()) {
			throw new Exception("stack empty hai");

		}
		idx++;
		arr[idx] = item;
	}

	public int pop() throws Exception {
		if (Isempty()) {
			throw new Exception("stack empty hai");

		}
		int x = arr[idx];
		idx--;
		return x;
	}

	public int peek() throws Exception {
		if (Isempty()) {
			throw new Exception("stack empty hai");

		}
		int x = arr[idx];

		return x;
	}

	public void Display() throws Exception {
		if (Isempty()) {
			throw new Exception("stack empty hai");

		}
		for (int i = 0; i <= idx; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public int size() {
		return idx + 1;
	}

	public boolean Isfull() {
		return idx + 1 == arr.length;
	}

	public boolean Isempty() {
		return idx == -1;

	}

}
