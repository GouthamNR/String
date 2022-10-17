package string;

public class WIthOutUsingCollectionNumOccurence {
	public static void main(String[] args) {
		String s ="welcomec";
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			int count=0;
			for (int j = 0; j < s1.length(); j++) {
				if (s.charAt(i)==s1.charAt(j)) {
					count++;
				} 

			}
			if (count==0) {
				s1=s1+ s.charAt(i);
			}
		}

		for (int i = 0; i <s1.length(); i++) {
			int count1 = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s1.charAt(i) == s.charAt(j)) {
					count1++;
				}

			}
			if (count1>0) {
				System.out.println(s.charAt(i) + " occured " + count1 + " time" );
			}
		}

	}
}

