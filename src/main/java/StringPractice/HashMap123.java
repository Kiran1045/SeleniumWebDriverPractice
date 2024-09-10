package StringPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class HashMap123 {

	public static void main(String[] args) {
	
		HashMap<String, Integer> map = new HashMap<>();
		map.put("abcd", 45);
		map.put("pete", 56);
		
		System.out.println(map.size());
		
		List<Integer> ios = new ArrayList<>();
		ios.add(50);
		ios.add(20);
		System.out.println( ios);
		System.out.println(map);

		
		ArrayList<String> al = new ArrayList<>();
		al.add("simba");
		al.add("bimba");
		System.out.println(al);
		
		Set<String> st = new HashSet<String>();
		
		st.add("bumbi");
		st.add("amirpete");
		System.out.println(st);
	}
}
