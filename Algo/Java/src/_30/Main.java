package _30;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for(int i = 1 ; i <= input ; i++) {
			if(i%2 == 0) System.out.print("+" + i);
			else if(i==1) System.out.print(i);
			else {
				System.out.print("-" + i);
			}
		}
	}
}
