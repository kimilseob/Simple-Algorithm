package _34;

import java.util.Scanner;

public class Main {
	
	public static int rec(int a) {
	
		if(a==1)
			return 1;
		if(a==2)
			return 1;
		
		return rec(a-1) + rec(a-2);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
	
		
		int sum = rec(input);
		
		System.out.println(sum);
	}
}
