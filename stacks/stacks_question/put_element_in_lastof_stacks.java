package stacks_question;
import java.util.Stack;

public class put_element_in_lastof_stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		insert(st, -6);
		System.out.println(st);

	}
	public static void insert(Stack<Integer> st,int item) {
		if (st.isEmpty()) {
			st.push(item);
			return;
		}
		int x=st.pop();
		insert(st, item);
		st.push(x);
		
	}

}
