package string;

public class checktheGivenStringIsPolindromeOrNot {
public static void main(String[] args) {
	String s = "malayalam";
	String s2 = "";
	for (int i = s.length()-1; i >=0; i--) {
		s2 = s2+s.charAt(i);
		
	}
	System.out.println(s);
	System.out.println(s2);
	
	if (s2.equalsIgnoreCase(s)) {
		System.out.println(" The Given String Is Polindrome");
	}
	else {
		System.out.println(" The Given String Is Not A Polindrome");
	}
}
}
