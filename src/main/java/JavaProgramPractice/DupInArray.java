package JavaProgramPractice;
public class DupInArray {
	public static void main(String[] args) {
		//Find how many duplicates in array
		int a[]= {23,45,23,67,67,78};
		int count=0;
		int b = 23;
				for(int val:a) {
					if(val==b)
					{
						count++;
					}
				}
				System.out.println(count);
	}

}
