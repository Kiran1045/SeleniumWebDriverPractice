package JavaPractice;

public class OverLoad {
	public void disp(int a,int b) {
	System.out.println("sum of a and b --"+(a+b));
	}
	public void disp(int a, int b, int c) {
		System.out.println("sum of a, b and c is --"+(a+b+c));
		
	}
	public void disp(String muti ,int c) {
		System.out.println("mut and buti ==" +(muti+c));
		
	}

	public static void main(String[] args) {
		OverLoad load = new OverLoad();
		load.disp(33, 55);
		load.disp(22, 33, 44);
		load.disp("amarendra", 444);
		

	}

}
