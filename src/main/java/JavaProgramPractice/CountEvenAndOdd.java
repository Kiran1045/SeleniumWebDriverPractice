package JavaProgramPractice;
public class CountEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {15,20,30,99,79,9,56,66};
		int even=0;
		int odd = 0;
		for(int val:a) {
			if(val%2==0) {
				even++;
				
			}
			else {
				odd++;
				
				
			}
		}
		System.out.println(even);
		System.out.println(odd);
		
	}

}
