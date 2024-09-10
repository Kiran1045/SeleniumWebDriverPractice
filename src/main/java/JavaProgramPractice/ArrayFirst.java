package JavaProgramPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayFirst {

	public static void main(String[] args) {
		ArrayList lisy = new ArrayList();
		lisy.add("abc");
		lisy.add(123);
		System.out.println(lisy.contains(123));
		System.out.println(lisy);
		int a[]= {10,20,30,40,50,60};
		System.out.println(a.length);
		System.out.println(a[2]);
		
		
		//for(int i=0;i<=a.length-1;i++)
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		
		for(int i:a)
		{
		System.out.println(i);
	}
}
}

