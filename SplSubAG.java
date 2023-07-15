package splSunAG;

import java.util.Scanner;

public class SplSubAG {
	public static int sequence(String str) {
		int res = 0;
		int a = 0;
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) == 'a') {
				int count = 0;
				count++;
				
			}
			else if(str.charAt(i) == 'g') {
				res += a;
			}
		}
		return 0;
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int value =  sequence(str);
		System.out.println(value);

	}

}
