package _8;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		int sum = 1;
		
		for(int i = input; i>=1 ; i--) {
			
			sum  = sum *i;
			
		}
		
		System.out.println(sum);
	}
}
