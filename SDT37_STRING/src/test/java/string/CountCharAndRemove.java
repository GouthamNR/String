package string;

public class CountCharAndRemove {
public static void main(String[] args) {
	String s = "AAABBBCCDAAE";
	char[] ch = s.toCharArray();
	int count = 0;
	for (int i = 0; i < ch.length-1; i++) {
		if (ch[i]==ch[i+1]) {
			count++;
		}
		else {
			count++;
			System.out.println(""+count+ch[i]);
			count=0;
		}
		if (i==ch.length-1) {
			if (ch[i]==ch[ch.length-2]) {
				System.out.println(ch[i]);
			}
		}
	}
}
}
