package _32;

import java.util.Scanner;

public class Main {
	
	public static int rec(int a , int b) {
		if(a == 4) return 4;
		return a + rec(a+1 ,b);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		
		int ans = 0;
		
		ans = rec(input1 , input2);
		System.out.println(ans);
	}
}
