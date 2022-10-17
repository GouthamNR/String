package string;

import java.util.LinkedHashSet;

public class CountTheDuplicates {
public static void main(String[] args) {
	String s = "aabcbccbddce"; 
	LinkedHashSet<Character> lHs = new LinkedHashSet<Character>();
	for (int i = 0; i < s.length(); i++) {
		lHs.add(s.charAt(i));
		
	}
	for (Character ch : lHs) {
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if (ch==s.charAt(i)) {
				count++;
			}
		}
		System.out.println(ch +" = " +count);
	}
}
}
