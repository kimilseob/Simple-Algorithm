package _7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		int input = scan.nextInt();
		boolean flag = true;
		for(int i=2; i<input; i++) {
			
			if(input%i == 0) {
				flag = false;
			}
			
		}
		
		if(flag) {
			System.out.println(input + "은 소수입니다.");
		}
		else {
			System.out.println(input + "은 소수가아닙니다.");
		}
		
		
		///////////////////////////////////
		
		
	}
}
