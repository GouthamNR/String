package string;

public class Pattern {
public static void main(String[] args) {
	int n =5;
	for (int r = 0; r < n; r++) {
		for (int c = 0; c < n; c++) {
			if (c>=n-r) {
				System.out.print(" * ");
			}
			else {
				System.out.print("   ");
			}
			
		}
		for (int c = 0; c < n; c++) {
			if (c<=r) {
				System.out.print(" * ");
			}
			
		}
		System.out.println();
	}
//	for (int r1 = 0; r1 < n; r1++) {
//		for (int c1 = 0; c1 < n; c1++) {
//			if (c1<=r1) {
//				System.out.print(" * ");
//			}
//			
//		}
//		System.out.println();
//		
//	}
	
}
}
