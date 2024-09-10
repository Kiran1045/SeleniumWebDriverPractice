package StringPractice;

public class StringReverse {

	public static void main(String[] args) {
		
		//Method1 - length(), charAt()
		
		/*String s="selenium";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse string :"+ rev);
		 */
		
		
		//Method2 - by converting string to char array
		/*String s="welcome";
		String rev="";
		
		char a[]=s.toCharArray();  // this will convert string to character type array
		System.out.println(Arrays.toString(a));  //[w, e, l, c, o, m, e]
		
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		
		System.out.println("Reverse string:"+ rev);
		*/
		
		//Method3 - using StringBuffer
		/*
		StringBuffer s=new StringBuffer("welcome");
		System.out.println(s.reverse());
		*/
		
		//Method4 - using StringBuilder
		/*StringBuilder s=new StringBuilder("welcome");
		System.out.println(s.reverse());*/
		
		String ring = "welcome";
		String rev ="";
		 for (int i = ring.length()-1;i>=0;i--) {
			 rev = rev+ring.charAt(i);
			 
		 }
		 System.out.println(rev);
		
		
	}

}

