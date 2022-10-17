package string;

public class ToReverseTheWords {
public static void main(String[] args) {
	String a = "My Name Is Goutham";
	String[] b = a.split(" ");
	for (int i = b.length-1; i >=0 ; i--) {
		System.out.print(b[i]+" ");
		
	}
}
}
