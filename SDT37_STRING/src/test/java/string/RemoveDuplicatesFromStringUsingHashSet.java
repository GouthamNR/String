package string;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromStringUsingHashSet {
public static void main(String[] args) {
	String s = "aabcbccbddce";
	String s2 = "";
	LinkedHashSet<Character> lHs = new LinkedHashSet();
	for (int i = 0; i < s.length(); i++) {
		lHs.add(s.charAt(i));
	}
	for (Character ch : lHs) {
		s2 = s2+ch;
	}
	
	System.out.println("Before Removing Duplicate ");
	System.out.println(s);
	System.out.println("After Removing Duplicate ");
	System.out.println(s2);
}
}
