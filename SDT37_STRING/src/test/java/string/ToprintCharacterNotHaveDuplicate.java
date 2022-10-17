package string;

import java.util.LinkedHashSet;

public class ToprintCharacterNotHaveDuplicate {
public static void main(String[] args) {
	String s = "abbcddeef";
	LinkedHashSet<Character> lHs = new LinkedHashSet<Character>();
	for (int i = 0; i < s.length(); i++) {
		lHs.add(s.charAt(i));
	}
	
	System.out.println("Character that are not repeating");
	for (Character ch : lHs) {
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if (ch==s.charAt(i)) {
				count++;
			}
		}
		if (count==1) {
			System.out.print(ch + " ");
		}
		
	}
}
}
