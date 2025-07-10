package basic;

public class subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques="abc";
		printsubseq(ques,"");
				

	}
	public static void printsubseq(String ques ,String ans) {
		if (ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0);
		printsubseq(ques.substring(1), ans);
		printsubseq(ques.substring(1), ans+ch);
		
	}

}
