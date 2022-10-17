package string;

public class ToFindVowelsInTheWord {
public static void main(String[] args) {
	String s = "goutham";
	int count1=0;
	for (int i = 0; i < s.length(); i++) {
		int count = 0;
		char ch = s.charAt(i);
		if (ch=='A'|| ch=='E' || ch=='I' || ch=='O'|| ch=='U'|| ch=='a'|| ch=='e' || ch=='i' ||ch=='o'||ch=='u') {
			count++;
		}
		if(count==1) {
			count1++;
			System.out.println(s.charAt(i) + " = " + count);
		}
	}
	System.out.println("the total number of voWels is : "+ count1 );
}
}
