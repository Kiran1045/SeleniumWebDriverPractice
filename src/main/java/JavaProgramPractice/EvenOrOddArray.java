package JavaProgramPractice;
public class EvenOrOddArray {

	public static void main(String[] args) {
		//Print even and odd numbers from an array
		//a={};
		//even
		//odd
		int a[] = {2,5,7,8,33,77,91,78,56};
		System.out.println("odd numbers");
		for(int val:a) {
			if(val%2!=0) {
				System.out.println(val);
			}
		}
		System.out.println("even numbers");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}

	}

}
