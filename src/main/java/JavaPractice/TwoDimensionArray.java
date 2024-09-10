package JavaPractice;

public class TwoDimensionArray {

	public static void main(String[] args) {
		int a[][]= {{10,20},
				{30,40},
				{50,60}};
		System.out.println(a.length);
		System.out.println(a[1].length);
		System.out.println(a[2][1]);

		//reading data from 2dimension array
		//nested for loop
		/*for(int i =0;i<=a.length-1;i++) {
			for(int j=0;j<=a[1].length-1;j++) {
				System.out.println(a[i][j]);
				System.out.println();

			}
		} */

		// using for each loop
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.print(x +"  ");
				System.out.println();
			}
		}

		// second way

		int b[][]= new int [3] [2];
		b[0][0]= 100;
		b[0][1]= 200;
		b[1][0]= 300;
		b[1][1]= 400;
		b[2][0]= 500;
		b[2][1]= 600;
		System.out.println(b.length);
		System.out.println(b[1].length);



	}

}
