package _4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int inputNum = scan.nextInt();
		int bin[] = new int[100];
		
		int i = 0;
		int mok = inputNum;
		
		while(mok>0) {
			
			bin[i] = mok % 2;
			mok  = mok/2;
			i++;
			
			
			
		}
		i--;
		
		for(int j = i; j>=0 ; j--) {
			System.out.print(bin[j]);
		}
		
	}

}
