package _24;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[8];
		double avg = 0;
		int cnt = 0;
		double total  = 0;
		System.out.println(arr.length);
		for(int i = 0; i < arr.length;i++) {
			arr[i] = scan.nextInt();
			
		}
		
		for(int  i = 0; i<arr.length;i++) {
			avg = avg + arr[i];
		}
		avg = (double)(avg/arr.length);
		
		for(int  i = 0; i<arr.length;i++) {
			if(avg < arr[i]) {
				cnt++;
			}
		}
		
		total  = ((double)cnt / arr.length)*100;
		
		System.out.println(total);
		
	}
}
