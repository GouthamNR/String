package string;

public class ToSortCharNumAndSplChar {
public static void main(String[] args) {
	String s = "hdjetg2438i98#@#6@%@$";
	String alph = " ";
	String num = " ";
	String spl = " ";
	for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		if (ch>='A'&&ch<='Z' || ch>='a' && ch<='z') {
			alph=alph+s.charAt(i);
		}
		else if (ch>='0'&&ch<='9') {
			num=num+s.charAt(i);
		}
		else {
			spl=spl+s.charAt(i);
		}
		
	}
	System.out.println(alph);
	System.out.println(num);
	System.out.println(spl);
}

}