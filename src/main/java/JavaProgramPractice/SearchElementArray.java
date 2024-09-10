package JavaProgramPractice;
import java.util.Iterator;
import java.util.Scanner;

public class SearchElementArray {

	public static void main(String[] args) {
		int a[]= {24,54,56,76,87,98};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int search_ele=sc.nextInt();
		boolean status = false;
		for(int i=0;i<=5;i++) {
			if(search_ele==a[i]) {
				System.out.println("Element found");
				status = true;
				break;
			}

		}
		if(status==false)
		{
			System.out.println("Element not found");
		}

	}

}
