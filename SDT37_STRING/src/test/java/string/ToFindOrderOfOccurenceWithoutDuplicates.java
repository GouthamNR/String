package string;

import java.util.LinkedHashSet;

public class ToFindOrderOfOccurenceWithoutDuplicates {
	public static void main(String[] args) {
		String s = "abbcddeef";
		LinkedHashSet<Character> lHs = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			lHs.add(s.charAt(i));
		} 
		int i=0;
		for (Character ch : lHs) {
			
				System.out.println(ch + " = " + i++);
			
		}
	}
}
