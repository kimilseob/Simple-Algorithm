package _31;

import java.util.Scanner;



public class Main {
	//≈ª√‚ ¡∂∞«
	public static int calFact(int i) {	
			
			if(i==1) {
				
				return 1;
			}
			
			return  i * calFact(i-1);
			
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int ans = 0;
		ans = calFact(input);
		System.out.println(ans);
	}
}
