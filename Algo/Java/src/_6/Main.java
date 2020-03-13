package _6;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int input1 = scan.nextInt();
		int input2 = scan.nextInt();
		
		int small;
		int big;
		
		if(input1 > input2) {
			big = input1;
			small = input2;
		}
		else {
			big = input2;
			small = input1;
		}
		
		int gcd = 1; //최대 공약수
		
		for(int i=1; i<= small ;i++) {
			
			if(big % i==0 && small % i ==0) {
				gcd = i;
			}
			
		}
		System.out.println(gcd);
	}
}
