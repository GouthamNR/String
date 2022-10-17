package string;

public class RemoveDuplicatesFromString {
	public static void main(String[] args) {
		String s = "aabacabbadc";
		String s2 =""+s.charAt(0);
		System.err.println(s2.length()); 
		for (int i = 0; i < s2.length()-1; i++) {
			if (s.charAt(i)==s.charAt(i+1)) {
			}
			/*
			 * if (s.charAt(i)==s2.charAt(i-1)) { s2=s2+" "; } else { s2=s2+s.charAt(i); }
			 */
			}
		System.out.println(s2);
		}
	}

