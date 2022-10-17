package string;

import java.util.LinkedHashSet;

public class ToFindRepeatedWordInTheGivenString {
public static void main(String[] args) {
	System.out.println("Without Using Linked HashSet");
	System.out.println("=============================");
	String s = "Goutham gagan goutham gagan mohan gagan mohan uma nishchitha";
	String[] s1 = s.split(" ");
	for (int i = 0; i < s1.length; i++) {
		String temp = s1[i];
		int count = 0;
		for (int j = 0; j < s1.length; j++) {
			if (temp.equalsIgnoreCase(s1[j])) {
				count++;
			}
		}
		if (count>1) {
			System.out.println(temp + " = " + count);
		}
	}
	System.out.println("With Using Linked HashSet");
	System.out.println("=========================");
	LinkedHashSet<String> lHs = new LinkedHashSet<String>();
	for (int i = 0; i < s1.length; i++) {
		lHs.add(s1[i]);
	}
	for (String str : lHs) {
		int count=0;
		for (int i = 0; i < s1.length; i++) {
			if (str.equalsIgnoreCase(s1[i])) {
				count++;
			}
			
		}
		System.out.println(str + " = " + count);
	}
}
}
