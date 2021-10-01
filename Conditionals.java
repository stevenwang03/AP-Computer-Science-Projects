public class SubStringExample {
	private int one , two;
	
	public SubStringExample(int n1, int n2) {
		setNums(n1,n2);
	}
	public void setNums ( int n1, int n2) {
		one = n1;
		two = n2;
	}
	public boolean compare() {
		if (one==two)
			return true;
		else
			return false;
	}
	public String toString() {
		if (one==two)
			return one + " and " + two + " are equal";
		else 
			return one + " and " + two + " are not equal";
	}
}




public class MoreAplusRunner {
	public static void main(String [] args ) {
		SubStringExample test = new SubStringExample(32,32);
		System.out.println(test);
		test.setNums(15,8);
		System.out.println(test);
	}
}


