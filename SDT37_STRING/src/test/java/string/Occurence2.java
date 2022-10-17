package string;

import java.util.LinkedHashSet;

public class Occurence2 {
public static void main(String[] args) {
	int[] a = {1, 2, 2, 3, 4 ,5, 5, 6};
	LinkedHashSet<Integer> hs = new LinkedHashSet();
	for(int i=0; i<a.length; i++){
	    hs.add(a[i]);
	    }
	for(Integer num : hs){
	int count = 0;
	for(int i=0; i<a.length; i++){
	    
	      if(num==a[i])
	       count++;
	    }
	System.out.println(num + "=" + count);
	}
}
}
