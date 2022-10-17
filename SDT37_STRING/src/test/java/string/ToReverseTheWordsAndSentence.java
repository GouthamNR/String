package string;

public class ToReverseTheWordsAndSentence {
	public static void main(String[] args) {
		String a = "My Name Is Goutham";
		String[] b = a.split(" ");
		for (int i = b.length-1; i >=0 ; i--) {
			String word = b[i];
			String tempWord = "";
			for (int j=word.length()-1; j >=0; j--) {
			tempWord= tempWord+word.charAt(j);
			}
			System.out.print(tempWord + " ");
	}
}
}
