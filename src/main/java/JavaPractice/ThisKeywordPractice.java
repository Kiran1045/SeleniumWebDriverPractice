package JavaPractice;

public class ThisKeywordPractice {
int abc;
int xyz;

public void thiss(int abc, int xyz) {
	this.abc=abc;
	this.xyz=xyz;
}
public void print() {
	abc=456;
	xyz=356;
	System.out.println("sum="+ (abc+xyz));
}
public static void main(String[] args) {
	ThisKeywordPractice pract = new ThisKeywordPractice();
	pract.thiss(20,30);
	pract.print();
}
}
