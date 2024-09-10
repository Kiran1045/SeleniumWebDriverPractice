package StringPractice;

public class BufferPracticeString {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.capacity());
		sb.append("word");
		System.out.println(sb);
		sb.replace(3, 6, "mand");
		System.out.println(sb);
		sb.length();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}

}
