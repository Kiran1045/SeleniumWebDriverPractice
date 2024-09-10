package JavaProgramPractice;
import java.util.Scanner;

public class ScannerBasic {

	public static void main(String[] args) {
		// scanner class for keyboard operation
		//system.in is taking input
		Scanner sc = new Scanner(System.in);
		//next int for giving input in console
		
		
		System.out.println("Enter the a value: ");
		int a=sc.nextInt();
		System.out.println("Enter the b value: ");
		int b= sc.nextInt();
		System.out.println("Sum of two number is: "+ (a+b));
	}

}
