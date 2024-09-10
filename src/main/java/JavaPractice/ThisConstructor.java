package JavaPractice;

public class ThisConstructor {
	int x;
	int y;
	public ThisConstructor(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("this will help to refer class variables");
	}
	void Constructor(){
		
		System.out.println("sum of x and y is --" +(x+y));
		
	}

	public static void main(String[] args) {
		ThisConstructor cont = new ThisConstructor(20,45);
		cont.Constructor();
		

	}

}
