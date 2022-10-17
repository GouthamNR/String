package string;

import java.util.LinkedHashSet;

public class Occorence {

		public static void main(String[] args){

		String name = "gouthamm";
		LinkedHashSet<Character> hs = new LinkedHashSet();
		for(int i=0; i<name.length(); i++){
		    hs.add(name.charAt(i));
		    }

		for(Character ch : hs){
		int count=0;
		for(int i=0; i<name.length(); i++){
		    if(ch==name.charAt(i))
		      count++;
		    }
		System.out.println(ch + "=" + count);
		}
		}
		}
		
