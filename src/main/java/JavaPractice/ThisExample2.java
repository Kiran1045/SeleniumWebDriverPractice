package JavaPractice;

public class ThisExample2 {
	int a;
	int b;
	public void meth1(int a,int b) {
		this.a=a;
		this.b=b;
		
	}
	public void meth2() {
		System.out.println("sum of a and b is --  " + (a+b));
	}
	public static void main(String[] args) {
		ThisExample2 exam = new ThisExample2();
		exam.meth1(50, 60);
		exam.meth2();
		
	}

}
