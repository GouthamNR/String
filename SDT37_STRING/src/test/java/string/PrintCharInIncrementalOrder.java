package string;

public class PrintCharInIncrementalOrder {
	public static void main(String[] args) {
		String s = "my name is goutham";
		String s1= s.replace(" ", "");
		System.out.println(s1);
		int count=0;
		int i=0;
		while(i<s1.length()) {
			int n = 0;
			while (n<=count) {
				System.out.print(s1.charAt(i));
				i++;
				n++;
			}
			System.out.print(" ");
			count++;
			if (count>2) {
				count=0;
			}
		}
	}

}
