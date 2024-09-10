package JavaProgramPractice;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int a[] = {20,45,10,6,7,88,99,66,55};
		System.out.println("before sort "+ Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting"+ Arrays.toString(a));
		
	}

}
