package string;

public class ToSwapFirstAndLastString {
public static void main(String[] args) {
	String s = "Welcome To Blore City"; 
	String[] s1 = s.split(" ");
	for (int i = 0; i < s1.length; i++) {
		if (i==s1.length-1) {
			String temp = s1[i];//city
			s1[i] = s1[0];//city=welcome
			s1[0]=temp;//welcome=city
		}
	}
	System.out.println("Before Swap ");
	System.out.println(s);
	System.out.println("After Swap");
	for (int i = 0; i < s1.length; i++) {
		System.out.print(s1[i]+ " ");
		
	}

}
}
