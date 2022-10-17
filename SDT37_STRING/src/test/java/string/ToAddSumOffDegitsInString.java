package string;

public class ToAddSumOffDegitsInString {
public static void main(String[] args) {
	String s = "a2b3c4";
	int sum =0;
	for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		if (ch>='0' && ch<='9') {
			sum=sum+(ch-48);
		}
	}
	System.out.println(sum);
}
}
