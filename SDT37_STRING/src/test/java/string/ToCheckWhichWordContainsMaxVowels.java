package string;

public class ToCheckWhichWordContainsMaxVowels {
public static void main(String[] args) {
	String s = "hi my name is goutham hi there";
	String[] sArray = s.split(" ");
	int maxVowel = 0;
	int minVowel=100;
	String maxWord="";
	String minWord="";
	for (int i = 0; i < sArray.length; i++) {
		String word = sArray[i];
		int count=0;
		for (int j = 0; j < word.length(); j++) {
			Character ch = word.charAt(j);
			if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
		}
		System.out.println(word + " contains " + count + " vowels");
		if (maxVowel<count) {
			maxVowel=count;
			maxWord=word;
			
		}
		if (minVowel>count) {
			minVowel=count;
			minWord=word;
		}
	}
	System.out.println("the word which contains max vowel is : "+maxWord);
	System.out.println("the word which contains min vowel is : " + minWord);

}
}
