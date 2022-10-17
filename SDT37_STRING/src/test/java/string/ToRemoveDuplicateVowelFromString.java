package string;

import java.util.LinkedHashSet;

public class ToRemoveDuplicateVowelFromString {
public static void main(String[] args) {
	String s = "gouthamnithin";
	LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
	int temp=0;
	for (int i = 0; i < s.length(); i++) {
		hs.add(s.charAt(i));
	}
	for (Character ch : hs) {
		int count=0;
			if (ch=='A'|| ch=='E' || ch=='I' || ch=='O'|| ch=='U'|| ch=='a'|| ch=='e' || ch=='i' ||ch=='o'||ch=='u') {
				count++;
			}
		if (count>0) {
			temp++;
			System.out.println(ch + " = " + count);
		}
	}
	System.out.println("total Number Of Vowel Is : " + temp);
}
}
