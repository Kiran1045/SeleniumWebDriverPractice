package StringPractice;

import java.util.Scanner;

public class FactorialPract {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int Fact = 1;
		for(int i= 1; i<=n;i++)
		{
			Fact = Fact*i;
			System.out.println(Fact);
		}
	}

}
